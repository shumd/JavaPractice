package ru.shumilin.calculator;

import lombok.AllArgsConstructor;
import ru.shumilin.calculator.operations.Operation;
import ru.shumilin.calculator.outputs.Output;

import java.util.HashMap;
import java.util.List;

@AllArgsConstructor
public class Calculator<T extends Number> {
    private final HashMap<String, Operation> operations;
    private Input<T> input;
    private Output output;

    public void calculate(String operation){
        Data<T> inputData = new Data<>(input.read());
        Operation currentOperation = operations.get(operation);

        double result = 0.0;
        for(T d : inputData.getData()){
            result += currentOperation.make(result,d).doubleValue();
        }

        Data<Double> outputData = new Data<>(List.of(result));

        output.print(outputData);
    }
}
