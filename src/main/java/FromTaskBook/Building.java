package FromTaskBook;

public class Building {
    private final static int MIN_FLOORS = 0;

    private final int floors;

    public int getFloors() {
        return floors;
    }

    public Building(int floors){
        if(floors < MIN_FLOORS){
            throw new IllegalArgumentException("Floors must be > " + MIN_FLOORS);
        }
        this.floors = floors;
    }


    @Override
    public String toString() {
        String keyWord;

        if (floors%100 != 1){
            keyWord = " этажами";
        }else {
            keyWord = " этажом";
        }

        return "дом с " + floors + keyWord;
    }
}
