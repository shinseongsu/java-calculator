package com.programers.presentaion;

import com.programers.application.Calculator;
import com.programers.ui.OutputView;

public class StringCalculator {

    private static final String SPACE_DELIMITER = " ";

    private final Calculator calculator;

    public StringCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void run(String input) {
        String[] inputs = splitString(input);
        OutputView.print(calculator.execute(inputs));
    }

    private String[] splitString(String input) {
        String[] inputs = input.split(SPACE_DELIMITER);

        if(input.length() % 2 != 1) {
            throw new IllegalArgumentException("연산자의 수식이 잘못되었습니다.");
        }

        return inputs;
    }
}
