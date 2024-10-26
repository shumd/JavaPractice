package FromTaskBook;

public class Square {
    private static final int MIN_SIDE_SIZE = 0;

    Point leftCorner;
    private int sideSize;

    public Square(Point leftCorner, int sideSize){
        this.leftCorner = leftCorner;
        setSideSize(sideSize);
    }

    public Square(int x, int y, int sideSize){
        this(new Point(x,y), sideSize);
    }

    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(int sideSize) {
        if(sideSize <= MIN_SIDE_SIZE){
            throw new IllegalArgumentException("SideSize must be > " + MIN_SIDE_SIZE);
        }

        this.sideSize = sideSize;
    }

    public Polyline getPolyline(){
        return new Polyline(leftCorner,
                new Point(leftCorner.x + sideSize, leftCorner.y),
                new Point(leftCorner.x + sideSize, leftCorner.y-sideSize),
                new Point(leftCorner.x, leftCorner.y-sideSize),
                leftCorner);
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + leftCorner +
                " со стороной " + sideSize;
    }
}
