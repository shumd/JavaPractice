package ru.shumilin.university;

import lombok.Getter;
import ru.shumilin.university.graduationSystems.GraduationSystem;

import java.util.ArrayList;
import java.util.List;

public class StudentSave {
    @Getter
    private final String name;
    private final GraduationSystem graduationSystem;
    private final List<Integer> marks;

    public StudentSave(Student student){
        name = student.getName();
        graduationSystem = student.getGraduationSystem();
        marks = new ArrayList<>(student.getMarks());
    }

    public Student load(){
        return new Student(name, graduationSystem, marks.toArray(new Integer[0]));
    }
}
