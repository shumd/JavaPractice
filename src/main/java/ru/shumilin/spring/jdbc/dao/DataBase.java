package ru.shumilin.spring.jdbc.dao;

import java.util.List;
import java.util.Optional;

public interface DataBase {
    Optional<List<Object>> findAll(Class<?> clazz);
}
