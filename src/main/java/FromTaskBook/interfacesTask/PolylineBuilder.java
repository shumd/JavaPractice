package FromTaskBook.interfacesTask;

import FromTaskBook.Polyline;



public class PolylineBuilder {
    public static Polyline buildPolyline(Polylineable... polylineables) {
        Polyline res = new Polyline();

        for(Polylineable polylineable : polylineables){
            res.add(polylineable.polyline().getPoints());
        }

        return res;
    }
}
