package com.programers.ui;

import java.util.Scanner;

public class InputView {

    private InputView() { }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
