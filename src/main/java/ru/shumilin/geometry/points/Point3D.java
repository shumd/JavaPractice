package ru.shumilin.geometry.points;

public class Point3D extends Point{
    public int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + x + ", " + y + ", " + z + "}";
    }
}
