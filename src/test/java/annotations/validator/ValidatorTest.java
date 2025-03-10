package annotations.validator;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import ru.shumilin.annotations.ValidateNotPassedException;
import ru.shumilin.annotations.Validator;

public class ValidatorTest {
    @Test
    @DisplayName("Validate one object (negative test)")
    public void test1(){
        Human human = new Human(-1);
        Assertions.assertThrows(ValidateNotPassedException.class, () -> Validator.validate(human));
    }

    @Test
    @DisplayName("Validate one object (positive test)")
    public void test2(){
        Human human = new Human(1);
        Validator.validate(human);
    }

    @Test
    @DisplayName("Exception handling that throws test method")
    public void test3(){
        Human human = new Human(1);
        HumanTests.USE_INCORRECT_TEST = true;
        Assertions.assertThrows(RuntimeException.class, () -> Validator.validate(human));
        HumanTests.USE_INCORRECT_TEST = false;
    }

    @Test
    @DisplayName("Validate few different objects (positive)")
    public void test4(){
        Human human = new Human(1);
        Building building = new Building(1);
        Validator.validate(human, building);
    }

    @Test
    @DisplayName("Validate few different objects (negative)")
    public void test5(){
        Human human = new Human(1);
        Building building = new Building(0);
        Assertions.assertThrows(ValidateNotPassedException.class, () -> Validator.validate(human, building));
    }

    @Test
    @DisplayName("Validate using renamed annotation (positive)")
    public void test6(){
        Employee employee = new Employee(1);
        Validator.validate(employee);
    }

    @Test
    @DisplayName("Validate using renamed annotation (negative)")
    public void test7(){
        Employee employee = new Employee(-1);
        Assertions.assertThrows(ValidateNotPassedException.class,() -> Validator.validate(employee));
    }
}
