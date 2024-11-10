package ru.shumilin.calculator;

import ru.shumilin.calculator.operations.*;
import ru.shumilin.calculator.outputs.ConsoleOutput;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Operation> operationHashMap = new HashMap<>();
        operationHashMap.put("+", new Sum());
        operationHashMap.put("-", new Min());
        operationHashMap.put("*", new Mult());
        operationHashMap.put("/", new Div());
        Calculator<Number> calculator = new Calculator<>(operationHashMap,
                new Input<>(new Numbers(1,2,4,5)),
                new ConsoleOutput());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите операцию: ");
        String operation = scanner.next();

        calculator.calculate(operation);

        scanner.close();
    }
}
