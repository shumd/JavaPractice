package ru.shumilin.spring;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import ru.shumilin.university.Student;

import java.util.function.Predicate;

@Component
@AllArgsConstructor
public class StudentFactory {
    private Predicate<Integer> range;

    public Student createStudent(String name, Integer... marks) {
        return new Student(name, range, marks);
    }
}
