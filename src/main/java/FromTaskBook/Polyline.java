package FromTaskBook;

import FromTaskBook.interfacesTask.Lengthable;
import FromTaskBook.interfacesTask.Polylineable;

import java.util.*;

public class Polyline implements Lengthable, Polylineable {
    private List<Point> points;

    public Polyline(Point... args){
        this(new ArrayList<>(Arrays.asList(args)));
    }

    public Polyline(List<Point> points){
        this.points = points;
    }

    public Polyline(){
        this(new ArrayList<>());
    }

    public ArrayList<Point> getPoints(){
        return new ArrayList<>(points);
    }

    public void add(List<Point> points){
        this.points.addAll(points);
    }

    public void add(Point... points){
        add(new ArrayList<>(Arrays.asList(points)));
    }

    @Override
    public int length(){
        int res = 0;
        for (int i = 1; i < points.size(); i++){
            Line l = new Line(points.get(i-1),points.get(i));
            res += l.length();
        }

        return res;
    }

    @Override
    public Polyline polyline() {
        return this;
    }

    @Override
    public String toString() {
        return "Линия " + points;
    }
}
