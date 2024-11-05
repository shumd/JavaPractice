package FromTaskBook.interfacesTask;

public class Summator{
    public double sum(Number... num) {
        double res = 0;
        for (Number number : num) {
            res += number.doubleValue();
        }

        return res;
    }
}
