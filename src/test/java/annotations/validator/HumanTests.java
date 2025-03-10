package annotations.validator;

import ru.shumilin.annotations.ValidateNotPassedException;

public class HumanTests {
    public static boolean USE_INCORRECT_TEST = false;

    void ageTest(Human human) {
        if (human.age > 200 || human.age < 1) throw new ValidateNotPassedException("Возраст человека не в диапазоне от 1 до 200");
    }

    void nullTest(Human human){
        if(USE_INCORRECT_TEST){
            Human s = null;
            int a = s.age;
        }
    }
}
