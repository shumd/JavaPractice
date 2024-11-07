package calculator;

public class ConsoleOutput extends Output<Object>{
    public ConsoleOutput(Data<Object> data) {
        super(data);
    }

    @Override
    public void print(Printable printable) {
        System.out.println(printable.print());
    }
}
