package FromTaskBook.Properties;

import FromTaskBook.Property;

public class ColorProperty extends Property {
    public ColorProperty(String color){
        super("Color", color);
    }

    @Override
    public String toString() {
        return "с цветом " + value;
    }
}
