package ru.shumilin.geometry.lines;

import lombok.SneakyThrows;
import ru.shumilin.geometry.points.Point;

import java.util.Objects;

public class LineGeneric <T extends Point> implements Lengthable, Polylineable, Cloneable {
    private T start, end;

    private LineGeneric(T start, T end) {
        setStart(start);
        setEnd(end);
    }

    public static <V extends Point> LineGeneric<V> of(V start, V end) {
        return new LineGeneric<>(start, end);
    }

    public static LineGeneric<Point> of(int x, int y, int x2, int y2) {
        return new LineGeneric<>(new Point(x, y), new Point(x2, y2));
    }

    public T getStart() {
        return start;
    }

    @SuppressWarnings("unchecked")
    public void setStart(T start) {
        this.start = (T) start.clone();
    }

    public T getEnd() {
        return end;
    }

    @SuppressWarnings("unchecked")
    public void setEnd(T end) {
        this.end = (T) end.clone();
    }

    @Override
    public int length() {
        return start.distanceTo(end);
    }

    @Override
    public Polyline polyline() {
        return new Polyline(start, end);
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }


    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        try {
            LineGeneric<T> line = (LineGeneric<T>) o;

            return Objects.equals(start, line.start) && Objects.equals(end, line.end) ||
                    Objects.equals(end, line.start) && Objects.equals(start, line.end);
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return start.hashCode() + end.hashCode();
    }

    @Override
    @SneakyThrows
    public LineGeneric clone() {
        LineGeneric line = (LineGeneric) super.clone();
        line.start = start.clone();
        line.end = end.clone();
        return line;
    }
}
