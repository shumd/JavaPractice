package FromTaskBook;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class Property {
    @Getter
    protected String name;
    protected Object value;

    public <T> T getValue() {
        return (T) value;
    }
}


