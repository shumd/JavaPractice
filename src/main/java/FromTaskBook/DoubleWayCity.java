package FromTaskBook;

public class DoubleWayCity extends City{
    public DoubleWayCity(String name, Way... ways){
        super(name, ways);
    }

    @Override
    public void addWay(Way way) {
        Way backWay = new Way(this, way.getPrice());

        if(getWays().contains(way) && way.getCityTo().getWays().contains(backWay)){
            return;
        }
        super.addWay(way);
        way.getCityTo().addWay(new Way(this, way.getPrice()));
    }
}


