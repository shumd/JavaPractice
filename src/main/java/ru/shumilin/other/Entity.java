package ru.shumilin.other;

import lombok.SneakyThrows;

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

        while (clazz != null) {
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                fields.add(field.getName() + "=" + field.get(this));
            }

            clazz = clazz.getSuperclass();
        }

        return res.append(fields).toString();
    }
}

