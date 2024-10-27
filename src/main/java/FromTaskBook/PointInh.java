package FromTaskBook;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ToString
public class PointInh {
    int x;
    @Setter
    private List<Property> properties;

    public PointInh(int x, Property... properties){
        this.properties = new ArrayList<>(Arrays.asList(properties));
    }

    public ArrayList<Property> getProperties(){
        return new ArrayList<>(properties);
    }

    public void addProperty(Property property){
        properties.add(property);
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        for(Property property: properties){
            stringBuilder.append(property.toString()).append(", ");
        }
        stringBuilder.delete(stringBuilder.length()-2,stringBuilder.length());

        return stringBuilder.toString();
    }
}

