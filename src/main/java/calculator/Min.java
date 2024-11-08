package calculator;

public class Min implements Operation{
    @Override
    public Number make(Number x, Number y) {
        return x.doubleValue()- y.doubleValue();
    }
}
