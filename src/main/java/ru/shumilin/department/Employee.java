package ru.shumilin.department;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Objects;

@Getter @EqualsAndHashCode
public class Employee {
    String name;
    Department department;

    public Employee(String name){
        this(name, null);
    }
    public Employee(Employee employee){
        this(employee.name, employee.department);
    }
    public Employee(String name, Department department){
        this.name = name;
        setDepartment(department);
    }

    public void setDepartment(Department department){
        if(this.department == department) return;
        if(this.department != null) this.department.employees.remove(this);
        if(this.department != null && this.department.head == this) this.department.head = null;
        this.department = department;
        if(this.department != null) this.department.employees.add(this);
    }

    @Override
    public String toString() {
        if(department == null){
            return name;
        }
        String result;
        String[] employeesNames = new String[department.employees.size()];

        for (int i = 0; i < department.employees.size(); i++){
            employeesNames[i] = department.employees.get(i).name;
        }


        if (department.head == this){
            result = name + " начальник отдела " + department.name
                    + ": " + Arrays.toString(employeesNames);
        }else
            if(department.head == null){
            result = name + " начальник отдела " + null +
                    " : " + Arrays.toString(employeesNames);
        }else {
                result = name + " работает в отделе " + department.name
                        + ": " + Arrays.toString(employeesNames)
                        + ", начальник которого " + department.head.name
                ;
        }

        return result;
    }
}
