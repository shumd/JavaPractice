package ru.shumilin.geometry.triangles;

import ru.shumilin.geometry.lines.Polylineable;
import ru.shumilin.geometry.Figure;
import ru.shumilin.geometry.lines.Line;
import ru.shumilin.geometry.lines.Polyline;
import ru.shumilin.geometry.points.Point;

public class Triangle extends Figure implements Polylineable {
    private Point b;
    private Point c;
    private final Line ab;
    private final Line bc;
    private final Line ac;

    public Triangle(Point a, Point b, Point c) {
        super(a);
        this.b = b;
        this.c = c;
        ab = new Line(mainPoint, this.b);
        bc = new Line(this.b, this.c);
        ac = new Line(mainPoint, this.c);

        if(ab.length() > ac.length()+bc.length()||
        bc.length() > ab.length()+ac.length()||
        ac.length() > bc.length()+ab.length()){
            throw new IllegalArgumentException("Такой треугольник не может существовать");
        }
    }

    public Polyline polyline() {
        return new Polyline(mainPoint,b,c,mainPoint);
    }

    // полупериметр
    private double p(){
        return (double) polyline().length()/2;
    }

    // формула Герона
    @Override
    public double area() {
        return Math.sqrt(p()*
                (p()-ab.length())*
                (p()- bc.length())*
                (p()- ac.length()));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + mainPoint +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
