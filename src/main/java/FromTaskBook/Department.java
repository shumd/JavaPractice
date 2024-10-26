package FromTaskBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {
    private String name;
    private Employee head;
    private List<Employee> employees;


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
        if(head != null){
            head.setDepartment(this);
        }
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public Employee getHead() {
        return head;
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
    public void addEmployee(Employee employee){
        employee.setDepartment(this);
        employees.add(employee);
    }
    public void removeEmployee(Employee employee){ // НА КОСТЫЛЯХ removeFromList & setDepartmentNull
        if(head == employee){
            head.setDepartment(null);
        }
        if(employees.contains(employee)){
            employees.remove(employee);
            employee.setDepartment(null);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name) && Objects.equals(head, that.head) && Objects.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, employees);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", employees=" + employees +
                '}';
    }
}
