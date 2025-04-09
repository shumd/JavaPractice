package ru.shumilin.annotations;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.*;

public class Entity {
    @SneakyThrows
    @Override
    public String toString() {
        Class<?> clazz = this.getClass();
        List<String> fields = new ArrayList<>();
        StringBuilder res = new StringBuilder(clazz.getSimpleName());

        while (clazz != null) {
            for(Field field: fieldsWithCorrectAnnotation(clazz)){
                fields.add(field.getName() + "=" + field.get(this));
            }
            clazz = clazz.getSuperclass();
        }

        return res.append(fields).toString();
    }

    public static Set<Field> fieldsWithCorrectAnnotation(Class<?> clazz){
        ToString.Values classAnnotationValue = clazz.isAnnotationPresent(ToString.class) ?
                clazz.getAnnotation(ToString.class).value() :
                ToString.Values.NO;

        return Arrays.stream(clazz.getDeclaredFields())
                .peek(field -> field.setAccessible(true))
                .filter(field -> field.isAnnotationPresent(ToString.class)
                        && field.getAnnotation(ToString.class).value().equals(ToString.Values.YES)
                || classAnnotationValue.equals(ToString.Values.YES))
                .collect(LinkedHashSet::new, Set::add, Set::addAll);
    }
}

