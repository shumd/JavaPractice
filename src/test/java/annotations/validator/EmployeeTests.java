package annotations.validator;

import ru.shumilin.annotations.ValidateNotPassedException;

public class EmployeeTests {
    void salaryTest(Employee emp) {
        if(emp.salary < 0) throw new ValidateNotPassedException("Salary must be greater than zero");
    }
}
