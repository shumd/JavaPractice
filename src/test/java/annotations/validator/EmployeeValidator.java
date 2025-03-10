package annotations.validator;

import ru.shumilin.annotations.Validate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Validate(EmployeeTests.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD,ElementType.ANNOTATION_TYPE})
public @interface EmployeeValidator {
}
