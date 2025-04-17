package ru.shumilin.spring.jdbc.dao;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class DAO {
    private DataBaseImpl dataBase;

    @SuppressWarnings("unchecked")
    public <T> List<T> findAll(Class<T> clz) {
        List<Object> entities = dataBase.findAll(clz).orElseThrow(
                () -> new RuntimeException("No entity found for " + clz.getName())
        );
        List<T> results = new ArrayList<>();
        for (Object object : entities) {
            results.add((T) object);
        }

        return results;
    }
}
