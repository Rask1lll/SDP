package Interpreter;

class ExpressionEvaluator {
    public static int calculate(String input) {
        String[] tokens = input.split(" ");
        MathExpression result = new NumericExpression(Integer.parseInt(tokens[0]));

        for (int i = 1; i < tokens.length; i += 2) {
            char operator = tokens[i].charAt(0);
            int nextValue = Integer.parseInt(tokens[i + 1]);
            result = new ArithmeticExpression(result, new NumericExpression(nextValue), operator);
        }
        return result.evaluate();
    }
}
