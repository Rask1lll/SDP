package Interpreter;

public class Main {
    public static void main(String[] args) {
        String expression = "10 - 4";
        int result = ExpressionEvaluator.calculate(expression);
        System.out.println("Result: " + result);
    }
}