package FromTaskBook;


public class SquareInheritance {
    private final Rectangle rectangle;

    public SquareInheritance(Point leftCorner, int sideSize) {
        rectangle = new Rectangle(leftCorner, sideSize, sideSize);
    }

    public SquareInheritance(int x, int y, int sideSize){
        this(new Point(x,y), sideSize);
    }

    public int getSideSize() {
        return rectangle.getHeight();
    }

    public void setSideSize(int sideSize) {
        rectangle.setHeight(sideSize);
        rectangle.setWidth(sideSize);
    }

    public Polyline getPolyline() {
        return rectangle.getPolyline();
    }

    public double area(){
        return rectangle.area();
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + rectangle.mainPoint +
                " со стороной " + rectangle.getHeight();
    }
}
