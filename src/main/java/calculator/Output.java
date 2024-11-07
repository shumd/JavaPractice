package calculator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Output<T> {
    private final Data<T> data;

    public abstract void print(Printable printable);
}
