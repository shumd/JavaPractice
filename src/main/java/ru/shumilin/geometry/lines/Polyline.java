package ru.shumilin.geometry.lines;

import lombok.EqualsAndHashCode;
import lombok.SneakyThrows;
import ru.shumilin.geometry.points.Point;

import java.util.*;

public class Polyline implements Lengthable, Polylineable, Cloneable {
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

    private List<Point> normalize() {return null;} // Заглушка

    // Включить нормализацию
    private List<Line> getLines(){
        List<Line> res = new ArrayList<>();

        for(int i = 1; i < points.size(); i++){
            res.add(new Line(points.get(--i),points.get(i)));
        }

        return res;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Polyline polyline)) return false;
        return getLines().equals(polyline.getLines()) ||
                getLines().equals(polyline.getLines().reversed());
    }

    @Override
    public final int hashCode() {
        int res = 0;

        for(Line line : getLines()){
            res += line.hashCode();
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

    @Override @SneakyThrows
    public Polyline clone(){
        Polyline res = (Polyline) super.clone();
        res.points = List.copyOf(points);
        return res;
    }
}
