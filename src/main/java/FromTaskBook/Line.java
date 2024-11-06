package FromTaskBook;

import FromTaskBook.interfacesTask.Lengthable;
import FromTaskBook.interfacesTask.Polylineable;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper=false)
public class Line implements Lengthable, Polylineable {
    private Point start;
    private Point end;

    public Line(int x1, int y1, int x2, int y2){
       this(new Point(x1,y1),
               new Point(x2,y2));
    }

    public Line(Point start, Point end){
        setStart(start);
        setEnd(end);
    }


    public void setStart(Point point){
        start = new Point(point);
    }
    public void setStart(int x, int y){
        setStart(new Point(x,y));
    }

    public void setEnd(Point point){
        end = new Point(point);
    }
    public void setEnd(int x, int y){
        setEnd(new Point(x,y));
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
}
