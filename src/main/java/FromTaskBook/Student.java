package FromTaskBook;

import FromTaskBook.exceptions.IllegalMarkException;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private static final int MIN_MARK = 2;
    private static final int MAX_MARK = 5;

    @Getter
    private String name;
    private List<Integer> marks = new ArrayList<>();


    public Student(String name, Integer...marks){
        setName(name);
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
            if(i < MIN_MARK || i > MAX_MARK){
                throw new IllegalMarkException(i);
            }
            this.marks.add(i);
        }
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
        return averageMark()==MAX_MARK;
    }

    @Override
    public String toString() {
        return  name + ": " + marks;
    }
}
