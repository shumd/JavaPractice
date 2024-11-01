package FromTaskBook.Properties;

public class ColorProperty extends Property {
    public ColorProperty(String color){
        super("Color", color);
    }

    @Override
    public String getValue() {
        return (String) value;
    }

    @Override
    public String toString() {
        return "с цветом " + value;
    }
}
