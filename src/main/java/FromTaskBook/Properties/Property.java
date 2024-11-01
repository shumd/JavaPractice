package FromTaskBook.Properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public abstract class Property {
    protected String name;
    protected Object value;

//    public <T> T getValue() {
//        return (T) value;
//    }
}


