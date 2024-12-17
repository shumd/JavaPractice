package ru.shumilin.university;

import lombok.Getter;
import ru.shumilin.university.graduationSystems.GraduationSystem;

import java.util.ArrayList;
import java.util.List;

@Getter
public class StudentSave {
    private final String name;
    private final GraduationSystem graduationSystem;
    private final List<Integer> marks;

    public StudentSave(Student student){
        name = student.getName();
        graduationSystem = student.getGraduationSystem();
        marks = new ArrayList<>(student.getMarks());
    }
}
