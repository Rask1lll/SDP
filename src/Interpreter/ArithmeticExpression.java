package Interpreter;
class ArithmeticExpression implements MathExpression {
    private MathExpression left;
    private MathExpression right;
    private char operator;

    public ArithmeticExpression(MathExpression left, MathExpression right, char operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public int evaluate() {
        if (operator == '+') {
            return left.evaluate() + right.evaluate();
        }
        else if (operator == '-') {
            return left.evaluate() - right.evaluate();
        }
        throw new UnsupportedOperationException("The operator " + operator + " does not allow");
    }
}
