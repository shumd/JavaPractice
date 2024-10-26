package FromTaskBook;

import java.util.Objects;

public class Way {
    private City cityTo;
    private int price;

    public Way(Way way){
        this(way.cityTo, way.price);
    }

    public Way(City cityTo, int price) {
        this.cityTo = cityTo;
        setPrice(price);
    }

    public City getCityTo() {
        return cityTo;
    }

    public int getPrice() {
        return price;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Way way = (Way) o;
        return price == way.price && Objects.equals(cityTo, way.cityTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityTo, price);
    }
}
