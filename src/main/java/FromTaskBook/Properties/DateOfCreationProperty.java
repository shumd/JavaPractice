package FromTaskBook.Properties;

public class DateOfCreationProperty extends Property {
    public DateOfCreationProperty(int hour, int minute){
        super("DateOfCreation", new Date(hour,minute));
    }

    @Override
    public Date getValue() {
        return (Date) value;
    }

    @Override
    public String toString() {
        return "в " + value;
    }
}
