package calculator;

import lombok.AllArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
public class Calculator {
    private final HashMap<String, Operation> operations;
    private Input<Integer> input;
    private Output<Integer> output;

    public void calculate(String operation){
        Data<Integer> data = new Data<>(input.read());
        operations.get(operation).make(data);
        output.print(data);
    }
}
