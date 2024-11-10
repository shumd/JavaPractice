package ru.shumilin.geometry.points;

import ru.shumilin.geometry.lines.properties.CoordinatesProperty;
import ru.shumilin.geometry.lines.properties.Property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PointWithProperty {
    int x;
    private final List<Property> properties;

    public PointWithProperty(int x, Property... properties){
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

