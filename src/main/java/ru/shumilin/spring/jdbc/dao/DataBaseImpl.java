package ru.shumilin.spring.jdbc.dao;

import lombok.Data;
import lombok.SneakyThrows;
import org.apache.commons.beanutils.ConvertUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.*;

@Component
@Data
@PropertySource("classpath:application.properties")
public class DataBaseImpl implements DataBase{
    @Value("${database.url}")
    private String url;
    @Value("${database.user}")
    private String user;
    @Value("${database.password}")
    private String password;

    private Connection connection;

    @Override
    public Optional<List<Object>> findAll(Class<?> entityClass) {
        try{
            connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String stringStatement = createSelectStatement(entityClass);
            ResultSet resultSet = statement.executeQuery(stringStatement);

            List<Object> entities = new ArrayList<>();

            while(resultSet.next()){
                Map<String, String> queryRes = new HashMap<>();
                for(Field field : entityClass.getDeclaredFields()){
                    field.setAccessible(true);
                    String columnLabel = createColumnLabel(field);
                    queryRes.put(columnLabel ,resultSet.getString(columnLabel));
                }
                entities.add(create(queryRes, entityClass).orElseThrow(
                        () -> new RuntimeException("Не удалось создать объект")
                ));
            }

            statement.close();
            resultSet.close();
            connection.close();

            return Optional.of(entities);
        }catch (SQLException e){
            e.printStackTrace();
        }

        return Optional.empty();
    }

    private static String createSelectStatement(Class<?> entity){
        String tableName = entity.getSimpleName().toLowerCase();

        return "SELECT * FROM " + tableName;
    }

    private static String createColumnLabel(Field field){
        field.setAccessible(true);
        String fieldName = field.getName();
        StringBuilder columnLabel = new StringBuilder();
        for(char c : fieldName.toCharArray()){
            if(Character.isUpperCase(c)){
                if(!columnLabel.isEmpty()) columnLabel.append("_");
                columnLabel.append(Character.toLowerCase(c));
            }else columnLabel.append(c);
        }

        return columnLabel.toString();
    }

    @SneakyThrows
    private static Optional<Object> create(Map<String, String> queryRes, Class<?> entityClass){
        List<Object> params = new ArrayList<>();

        for(Field field : entityClass.getDeclaredFields()){
            field.setAccessible(true);
            Class<?> fieldType = field.getType();
            String columnLabel = createColumnLabel(field);
            params.add(ConvertUtils.convert(queryRes.get(columnLabel), fieldType));
        }

        for(Constructor<?> constructor : entityClass.getDeclaredConstructors()){
            constructor.setAccessible(true);
            if(constructor.getParameterTypes().length == params.size()){
                return Optional.of(constructor.newInstance(params.toArray()));
            }
        }

        return Optional.empty();
    }
}
