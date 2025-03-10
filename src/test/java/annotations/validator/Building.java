package annotations.validator;

import lombok.AllArgsConstructor;
import ru.shumilin.annotations.Validate;

@Validate(BuildingTests.class)
@AllArgsConstructor
public class Building {
    int floors;
}
