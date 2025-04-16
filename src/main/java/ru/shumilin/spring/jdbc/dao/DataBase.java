package ru.shumilin.spring.jdbc.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.sql.*;

@Component
@Data
@PropertySource("classpath:application.properties")
public class DataBase {
    @Value("${database.url}")
    private String url;
    @Value("${database.user}")
    private String user;
    @Value("${database.password}")
    private String password;

    private Connection connection;

    public <T> T get(Entity entity){
        try{
            connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(createSelectStatement(entity));
            Class<?> clazz = entity.getClass();

            while(resultSet.next()){
                for(Field field : clazz.getDeclaredFields()){
                     resultSet.getString(createColumnLabel(field));

//                     TODO запарсить стрингу и засунуть ее в объект и вернуть его
                }
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private static String createSelectStatement(Entity entity){
        return "SELECT * FROM " +
                entity.getName() +
                " WHERE " +
                entity.getName() +
                ".id = " +
                entity.getId();
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
}
