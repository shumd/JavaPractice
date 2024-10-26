package FromTaskBook;

public class Circle extends Figure {
    private final double radius;

    public Circle(Point center, int radius) {
        super(center);

        if (radius < 0){
            throw new IllegalArgumentException("Radius must be a positive number");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point center(){
        return mainPoint;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + mainPoint +
                '}';
    }
}
