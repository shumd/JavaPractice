package FromTaskBook;

import lombok.ToString;

@ToString
public class DateOfCreationProperty extends Property{
    public DateOfCreationProperty(int hour, int minute){
        super("DateOfCreation", new Time(hour,minute,0));
    }
}
