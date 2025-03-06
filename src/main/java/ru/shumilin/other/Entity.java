package ru.shumilin.other;

import lombok.SneakyThrows;
import ru.shumilin.annotations.ToString;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Entity {
    @SneakyThrows
    @Override
    public String toString() {
        Class<?> clazz = this.getClass();
        StringBuilder res = new StringBuilder(clazz.getSimpleName());
        List<String> fields = new ArrayList<>();
        boolean allClassIsAnnotated = false;

        while (clazz != null) {
            if(clazz.isAnnotationPresent(ToString.class) &&
                    clazz.getAnnotation(ToString.class).value().equals(ToString.Values.YES))
                allClassIsAnnotated = true;

            for (Field field : clazz.getDeclaredFields()) {
                boolean isCorrect = false;
                field.setAccessible(true);

                if(allClassIsAnnotated && !field.isAnnotationPresent(ToString.class)) {
                        isCorrect = true;
                }else if(field.isAnnotationPresent(ToString.class) &&
                        field.getAnnotation(ToString.class).value().equals(ToString.Values.YES)){
                    isCorrect = true;
                }

                if(isCorrect) fields.add(field.getName() + "=" + field.get(this));
            }

            clazz = clazz.getSuperclass();
        }

        return res.append(fields).toString();
    }
}

