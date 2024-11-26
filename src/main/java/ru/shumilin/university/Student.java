package ru.shumilin.university;

import lombok.Getter;
import ru.shumilin.university.graduationSystems.GraduationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private GraduationSystem graduationSystem;
    @Getter
    private String name;
    private List<Integer> marks = new ArrayList<>();


    public Student(String name, GraduationSystem graduationSystem,Integer...marks){
        setName(name);
        this.graduationSystem = graduationSystem;
        addMarks(marks);
    }

    public void setName(String name) {
        if(name.isBlank()){
            throw new IllegalArgumentException();
        }

        this.name = name;
    }


    public List<Integer> getMarks() {
        return new ArrayList<>(marks);
    }

    public void setMarks(List<Integer> marks) {
        marks.clear();
        addMarks(marks.toArray(new Integer[0]));
    }

    public void addMarks(Integer... marks){
        for (Integer i : marks){
            if(i < graduationSystem.getMinMark() || i > graduationSystem.getMaxMark()){
                throw new IllegalMarkException(i);
            }
            this.marks.add(i);
        }
    }
    public void removeMark(int index){
        marks.remove(index);
    }


    public double averageMark(){
        if(marks.isEmpty()) return 0;

        int sum = 0;

        for(Integer i : marks){
            sum+= i;
        }

        return (double) sum /marks.size();
    }

    public boolean isExcellentStudent(){
        return averageMark()==graduationSystem.getMaxMark();
    }

    @Override
    public int compareTo(Student o) {
        //return (int) (this.averageMark()-o.averageMark()); почему не так?
        if(this.averageMark()==o.averageMark()){
            return 0;
        }else if(this.averageMark()>o.averageMark()){
            return 1;
        }else return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(averageMark(), student.averageMark());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name) + Objects.hashCode(averageMark());
    }

    @Override
    public String toString() {
        return  name + ": " + marks;
    }
}
