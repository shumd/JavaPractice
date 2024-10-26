package FromTaskBook;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ToString
public class PointInh {
    int x;
    List<Property> properties;

    public PointInh(int x, Property... properties){
        this.properties = new ArrayList<>(Arrays.asList(properties));
    }
}

