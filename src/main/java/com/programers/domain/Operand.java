package com.programers.domain;

public class Operand {

    private int number;

    public Operand(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static Operand from(String input) {
        try {
            return new Operand(Integer.parseInt(input));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("잘못된 연산자가 입력되었습니다.");
        }
    }
}
