package FromTaskBook;

public class Triangle extends Figure{
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

        if(ab.lenght() > ac.lenght()+bc.lenght()||
        bc.lenght() > ab.lenght()+ac.lenght()||
        ac.lenght() > bc.lenght()+ab.lenght()){
            throw new IllegalArgumentException("Такой треугольник не может существовать");
        }
    }

    public Polyline getPolyline() {
        return new Polyline(mainPoint,b,c,mainPoint);
    }

    // полупериметр
    private double p(){
        return (double) getPolyline().length()/2;
    }

    // формула Герона
    @Override
    public double area() {
        return Math.sqrt(p()*
                (p()-ab.lenght())*
                (p()- bc.lenght())*
                (p()- ac.lenght()));
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
