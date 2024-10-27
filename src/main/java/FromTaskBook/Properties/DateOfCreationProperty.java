package FromTaskBook.Properties;

import FromTaskBook.Property;
import lombok.ToString;

public class DateOfCreationProperty extends Property {
    public DateOfCreationProperty(int hour, int minute){
        super("DateOfCreation", new Date(hour,minute));
    }

    @Override
    public String toString() {
        return "в " + value;
    }
}
