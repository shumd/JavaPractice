package FromTaskBook;

import FromTaskBook.Properties.CoordinatesProperty;
import FromTaskBook.Properties.Property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PointInh {
    int x;
    private final List<Property> properties;

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
        StringBuilder stringBuilder = new StringBuilder("Точка {" + x);

        for(Property property : properties){
            if(property.getName().equals("Coordinates")){
                CoordinatesProperty coordinatesProperty = (CoordinatesProperty) property;
                for(Integer i : coordinatesProperty.getValue()){
                    stringBuilder.append(";").append(i);
                }
                break;
            }
        }
        stringBuilder.append("} ");

        for(Property property: properties){
            if(property.getName().equals("Coordinates")){continue;}

            stringBuilder.append(property.toString()).append(", ");
        }
        stringBuilder.delete(stringBuilder.length()-2,stringBuilder.length());

        return stringBuilder.toString();
    }
}

