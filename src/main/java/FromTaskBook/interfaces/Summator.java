package FromTaskBook.interfaces;

public class Summator implements Sumable{
    @Override
    public double sum(Number... num) {
        double res = 0;
        for (Number number : num) {
            res += number.doubleValue();
        }

        return res;
    }
}
