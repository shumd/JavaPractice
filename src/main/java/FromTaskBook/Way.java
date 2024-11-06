package FromTaskBook;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Way {
    private final City cityTo;
    private int price;

    public Way(Way way){
        this(way.cityTo, way.price);
    }

    public Way(City cityTo, int price) {
        this.cityTo = cityTo;
        setPrice(price);
    }

    public void setPrice(int price){
        if(price < 0){
            throw new IllegalArgumentException();
        }

        this.price = price;
    }

    @Override
    public String toString() {
        return cityTo.getName() + ":" + price;
    }
}
