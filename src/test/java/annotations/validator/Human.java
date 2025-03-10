package annotations.validator;

import lombok.AllArgsConstructor;
import ru.shumilin.annotations.Validate;

@AllArgsConstructor
@Validate(HumanTests.class)
public class Human {
    int age;
}
