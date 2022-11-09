package com.programers.domain;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public enum Operator {
    PLUS("+", (frontOperand, backOperand) -> frontOperand + backOperand),
    MINUS("-", (frontOperand, backOperand) -> frontOperand - backOperand),
    MULTIPLY("*", (frontOperand, backOperand) -> frontOperand * backOperand),
    DIVISION("/", (frontOperand, backOperand) -> {
        if (backOperand == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다");
        }
        return frontOperand / backOperand;
    });

    private final String operator;
    private final IntBinaryOperator expression;

    Operator(String operator, IntBinaryOperator expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public IntBinaryOperator getExpression() {
        return expression;
    }

    public boolean isSignMatcher(String sign) {
        return this.operator.equals(sign);
    }

    public static Operator from(String sign) {
        return Arrays.stream(values())
            .filter(operator -> operator.isSignMatcher(sign))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("등록되지 않은 부등호입니다."));
    }

}
