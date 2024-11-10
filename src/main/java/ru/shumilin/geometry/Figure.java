package ru.shumilin.geometry;

import ru.shumilin.geometry.points.Point;

public abstract class Figure {
    protected Point mainPoint;

    public Figure(Point mainPoint) {
        this.mainPoint = mainPoint;
    }

    public abstract double area();
}
