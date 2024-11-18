package ru.shumilin.department;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode @ToString
public class Department {
    @Getter
    String name;
    @Getter
    Employee head;
    List<Employee> employees;


    public Department(String name, Employee head, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
        setHead(head);
    }

    public Department(String name, Employee head){
        this(name,head, new ArrayList<>());
    }

    public Department(Department department){
        this(department.name, department.head, department.employees);
    }


    public void setHead(Employee head){
        if(head != null) head.setDepartment(this);
        this.head = head;
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
    public void addEmployee(Employee employee){
        if(employee != null){
            employee.setDepartment(this);
        }
    }
    public void removeEmployee(Employee employee){
        if(employees.contains(employee)){
            employee.setDepartment(null);
        }
    }
}
