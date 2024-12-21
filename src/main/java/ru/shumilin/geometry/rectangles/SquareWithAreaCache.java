package ru.shumilin.geometry.rectangles;

import ru.shumilin.geometry.points.Point;

public class SquareWithAreaCache extends SquareInheritance{
    private double cache;
    private final SquareInheritance squareInheritance;
    private int width;

    public SquareWithAreaCache(SquareInheritance squareInheritance){
        super(squareInheritance.getTopLeftCorner(), squareInheritance.width());
        this.squareInheritance = squareInheritance;
    }

    @Override
    public double area(){
        if(squareInheritance.width() != width){
            cache = squareInheritance.area();
            width = squareInheritance.width();
        }
        return cache;
    }

    @Override
    public void setBottomRightCorner(Point bottomRightCorner) {
        squareInheritance.setBottomRightCorner(bottomRightCorner);
    }
}
