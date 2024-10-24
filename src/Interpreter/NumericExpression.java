package Interpreter;

class NumericExpression implements MathExpression {
    private int value;

    public NumericExpression(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
