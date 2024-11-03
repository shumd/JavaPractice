package FromTaskBook;



public class Rectangle extends Figure {
    private Point topLeftCorner = mainPoint;
    private Point bottomRightCorner;

    public Rectangle(Point topLeftCorner, Point bottomRightCorner) {
        super(topLeftCorner);
        this.bottomRightCorner = bottomRightCorner;
    }

    public Rectangle(Point topLeftCorner, int height, int width) {
        this(topLeftCorner, new Point(topLeftCorner.x+width, topLeftCorner.y-height));
    }

    public Rectangle(int x, int y, int height, int width) {
        this(new Point(x,y), height, width);
    }

    public void setTopLeftCorner(Point topLeftCorner) {
        this.topLeftCorner = topLeftCorner;
        if(isIncorrect()) throw new IllegalArgumentException("topLeftCorner is wrong");
    }
    public void setBottomRightCorner(Point bottomRightCorner) {
        this.bottomRightCorner = bottomRightCorner;
        if(isIncorrect()) throw new IllegalArgumentException("bottomRightCorner is wrong");
    }

    public Point getTopLeftCorner() {
        return new Point(topLeftCorner);
    }
    public Point getBottomRightCorner() {
        return new Point(bottomRightCorner);
    }


    protected boolean isIncorrect(){
        return width()<1 || height()<1;
    }

    protected int width(){
        return bottomRightCorner.x-topLeftCorner.x;
    }
    protected int height(){
        return topLeftCorner.y-bottomRightCorner.y;
    }

    @Override
    public double area() {
        return width()*height();
    }

    @Override
    public String toString() {
        return "Прямоугольник в точке " + mainPoint +
                " с высотой " + height() +
                " и шириной " + width();
    }
}
