package com.triglav.HW_2_2;

public class MyArrayDataException extends Exception {
    private int i;
    private int j;

    public MyArrayDataException(int i, int j) {
        super("Не возможно преобразовать значение в массиве");
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
