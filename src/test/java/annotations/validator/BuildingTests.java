package annotations.validator;

import ru.shumilin.annotations.ValidateNotPassedException;

public class BuildingTests {
    void floorTest(Building building){
        if(building.floors < 1) throw new ValidateNotPassedException("Floors must be greater than 0");
    }
}
