package ru.shumilin.textClasses;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectsReader <T>{
    Class<?> genericClass;

    private ObjectsReader(Class<?> genericClass){
        this.genericClass = genericClass;
    }

    public static <V> ObjectsReader<V> of(Class<?> genericClass){
        return new ObjectsReader<>(genericClass);
    }

    @SneakyThrows @SuppressWarnings("unchecked")
    public List<T> read(File file){
        try(Scanner sc = new Scanner(file)){
            List<T> res = new ArrayList<>();

            while(sc.hasNext()){
            Class<?> clazz = Class.forName(sc.next());

            if(clazz.equals(genericClass)) {
                Constructor<?> constructor = clazz.getConstructors()[0];
                List<String> param = new ArrayList<>();

                String scValue = sc.next();
                while (!scValue.equals("|")) {
                    param.add(scValue);
                    scValue = sc.next();
                }

                res.add((T) constructor.newInstance(param.toArray()));
                param.clear();
            }else {
                String scValue = sc.next();
                while (!scValue.equals("|")) {
                    scValue = sc.next();
                }
            }
            }

            return res;
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
