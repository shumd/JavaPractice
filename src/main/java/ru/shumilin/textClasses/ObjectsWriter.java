package ru.shumilin.textClasses;


import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class ObjectsWriter {
    private String fileName;

    private ObjectsWriter(String fileName){
        this.fileName = fileName;
    }

    public static ObjectsWriter of(String fileName){
        return new ObjectsWriter(fileName);
    }

    private List<String> constructorParametersName(Constructor<?> constructor){
        List<String> res = new ArrayList<>();
        Parameter[] parameters = constructor.getParameters();

        for(Parameter p : parameters){
            res.add(p.getName());
        }

        return res;
    }

    @SneakyThrows
    public File write(Object... args){
        File res = new File(fileName);

        try(FileWriter fileWriter = new FileWriter(res)) {
            for (Object obj : args) {
                Class<?> clazz = obj.getClass();
                List<String> paramNames = constructorParametersName(clazz.getConstructors()[0]);

                fileWriter.write(clazz.getName());

                for (String name : paramNames) {
                    Field field = clazz.getDeclaredField(name);
                    field.setAccessible(true);
                    fileWriter.write(" " + (String) field.get(obj));
                }

                fileWriter.write(" | ");
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e.getMessage());
        }

        return res;
    }
}
