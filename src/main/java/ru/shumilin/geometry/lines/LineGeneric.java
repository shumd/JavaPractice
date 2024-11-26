package ru.shumilin.geometry.lines;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import ru.shumilin.geometry.points.Point;
import ru.shumilin.geometry.points.Point3D;

import java.util.Objects;

@Getter @Setter
public class LineGeneric <T extends Point> implements Lengthable, Polylineable, Cloneable {
    T start;
    T end;

    public LineGeneric(T start, T end){
        this.start = start;
        this.end = end;
    }

    @Override
    public int length(){
        return (int)Math.sqrt(Math.pow(end.x - start.x,2) + Math.pow(end.y - start.y,2));
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineGeneric<T> line = (LineGeneric<T>) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end) ||
                Objects.equals(end, line.start) && Objects.equals(start, line.end);
    }

    @Override
    public int hashCode() {
        return start.hashCode() + end.hashCode();
    }

    @Override @SneakyThrows
    public LineGeneric clone() {
        LineGeneric res = (LineGeneric) super.clone();
        res.start = start.clone();
        res.end = end.clone();
        return res;
    }
}