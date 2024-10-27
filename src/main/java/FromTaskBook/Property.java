package FromTaskBook;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Property {
    @Getter
    protected String name;
    @Setter
    protected Object value;

    public <T> T getValue() {
        return (T) value;
    }
}


