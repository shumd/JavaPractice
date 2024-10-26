package FromTaskBook;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(Point leftCorner, int height, int width) {
        super(leftCorner);
        setHeight(height);
        setWidth(width);
    }

    public Rectangle(int x, int y, int height, int width) {
        this(new Point(x,y), height, width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height <= 0){
            throw new IllegalArgumentException("Side must be > 0" );
        }

        this.height = height;
    }

    public void setWidth(int width) {
        if(width <= 0){
            throw new IllegalArgumentException("Side must be > 0");
        }

        this.width = width;
    }

    public Polyline getPolyline(){
        return new Polyline(mainPoint,
                new Point(mainPoint.x + width, mainPoint.y),
                new Point(mainPoint.x + width, mainPoint.y - height),
                new Point(mainPoint.x, mainPoint.y - height),
                mainPoint);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Прямоугольник в точке " + mainPoint +
                " с высотой " + height +
                " и шириной " + width;
    }
}
