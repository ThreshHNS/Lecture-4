package ru.ifmo.backend_2021.expressions;

public class Add extends BinaryOperator {

    public Add(Expression a, Expression b) {
        super(String.valueOf(Utils.ADD), a, b);
    }

    @Override
    int evaluate(int a, int b) {
        return a + b;
    }
}
