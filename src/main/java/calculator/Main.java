package calculator;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Operation> operationHashMap = new HashMap<>();
        operationHashMap.put("+", new Sum());
        operationHashMap.put("-", new Min());
        operationHashMap.put("*", new Mult());
        operationHashMap.put("/", new Div());
        Calculator calculator = new Calculator(operationHashMap);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNum = scanner.nextInt();

        System.out.print("Введите операцию: ");
        String operation = scanner.next();

        calculator.calculate(firstNum,secondNum,operation);

        scanner.close();
    }
}
