package ru.shumilin.main;

import java.util.List;

public class DAO {
    public <T> List<T> findAll(Class<T> clz){

    }
}

class Employee{
    Integer id;
    String name;
    Integer departmentId;
}
