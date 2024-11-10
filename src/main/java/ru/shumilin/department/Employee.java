package ru.shumilin.department;

import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private String name;
    private Department department;


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

    public String getName() {
        return name;
    }

    public void setDepartment(Department department){
        if(this.department != null) {
            if (this.department == department) {
                return;
            }
            if (this.department.getHead() == this) {
                this.department.setHead(null);
            }
            this.department.removeEmployee(this);
            this.department = department;
        }else {
            this.department = department;
        }
        if(this.department != null) {
            this.department.addEmployee(this);
        }
    }
    public Department getDepartment(){
        return department;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department);
    }

    @Override
    public String toString() {
        if(department == null){
            return name;
        }
        String result;
        String[] employeesNames = new String[department.getEmployees().size()];

        for (int i = 0; i < department.getEmployees().size(); i++){
            employeesNames[i] = department.getEmployees().get(i).name;
        }


        if (department.getHead() == this){
            result = name + " начальник отдела " + department.getName()
                    + ": " + Arrays.toString(employeesNames);
        }else
            if(department.getHead() == null){
            result = name + " начальник отдела " + null +
                    " : " + Arrays.toString(employeesNames);
        }else {
                result = name + " работает в отделе " + department.getName()
                        + ": " + Arrays.toString(employeesNames)
                        + ", начальник которого " + department.getHead().name
                ;
        }

        return result;
    }
}
