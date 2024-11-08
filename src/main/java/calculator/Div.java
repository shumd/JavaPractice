package calculator;

public class Div implements Operation{
    @Override
    public Number make(Number x, Number y) {
        return x.doubleValue() / y.doubleValue();
    }
}
