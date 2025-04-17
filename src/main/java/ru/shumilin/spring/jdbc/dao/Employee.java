package ru.shumilin.spring.jdbc.dao;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Employee {
    private Integer id;
    private String name;
    private Integer departmentId;
}
