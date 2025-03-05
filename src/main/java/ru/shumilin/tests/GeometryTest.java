package ru.shumilin.tests;

import ru.shumilin.geometry.lines.Line;
import ru.shumilin.geometry.lines.Polyline;
import ru.shumilin.geometry.points.Point;

import java.util.List;

public class GeometryTest {
    void polylineTest(){
        Polyline polyline = new Polyline(List.of(new Point(1,1), new Point(1,6)));
        var res = polyline.length();

        if(res != 5) throw new TestNotPassedException("polylineTest not passed");
    }

    void failTest(){
        throw new TestNotPassedException("failTest failed");
    }

    void lineTest(){
        Line line = new Line(0,0,1,5);
        int res = line.length();

        if(res != 5) throw new TestNotPassedException("lineTest not passed");
    }
}
