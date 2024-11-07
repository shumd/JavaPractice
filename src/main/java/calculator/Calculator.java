package calculator;

import lombok.AllArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
public class Calculator {
    private final HashMap<String, Operation> operations;
    private Input input;
    private Output output;

    public void calculate(String operation){
        Data data = input.read();
        operations.get(operation).make(data);
        output.print(data);
    }
}
