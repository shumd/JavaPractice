package ru.shumilin.geometry.lines;


public class PolylineBuilder {
    public static Polyline buildPolyline(Polylineable... polylineables) {
        Polyline res = new Polyline();

        for(Polylineable polylineable : polylineables){
            res.add(polylineable.polyline().getPoints());
        }

        return res;
    }
}
