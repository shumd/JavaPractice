package calculator;

public class ConsoleOutput implements Output{
    @Override
    public void print(Printable printable) {
        System.out.println(printable.print());
    }
}
