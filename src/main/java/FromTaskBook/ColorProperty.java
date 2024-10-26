package FromTaskBook;

import lombok.ToString;

@ToString
public class ColorProperty extends Property{
    public ColorProperty(String color){
        super("Color", color);
    }
}
