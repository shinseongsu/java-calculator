package com.programers.application;

import com.programers.domain.Operand;
import com.programers.domain.Operator;

public class Calculator {

    public int execute(String[] inputs) {
        int total = Operand.from(inputs[0]).getNumber();

        for (int i = 1; i < inputs.length; i += 2) {
            Operator operator = Operator.from(inputs[i]);
            Operand operand = Operand.from(inputs[i + 1]);
            total = operator.getExpression().applyAsInt(total, operand.getNumber());
        }

        return total;
    }

}
