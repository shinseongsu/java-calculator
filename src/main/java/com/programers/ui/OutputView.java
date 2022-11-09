package com.programers.ui;

public class OutputView {

    private static final String RESULT_MESSAGE = "결과 : ";

    private OutputView() { }

    public static void print(int result) {
        System.out.println(RESULT_MESSAGE + result);
    }

}
