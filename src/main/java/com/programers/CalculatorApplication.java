package com.programers;

import com.programers.application.Calculator;
import com.programers.presentaion.StringCalculator;
import com.programers.ui.InputView;

public class CalculatorApplication {

    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator(new Calculator());
        stringCalculator.run(InputView.scanner());
    }

}
