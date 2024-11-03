package FromTaskBook;


public class SquareInheritance extends Rectangle {
    public SquareInheritance(Point leftCorner, int sideSize) {
        super(leftCorner,sideSize,sideSize);
    }

    public SquareInheritance(int x, int y, int sideSize){
        this(new Point(x,y), sideSize);
    }

    @Override
    protected boolean isIncorrect() {
        return width()!=height();
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + mainPoint +
                " со стороной " + width();
    }
}
