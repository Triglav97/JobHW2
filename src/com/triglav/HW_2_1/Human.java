package com.triglav.HW_2_1;

public class Human implements Move {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.printf("Человек %s прыгнул\n", this.name);
    }

    @Override
    public void run() {
        System.out.printf("Человек %s пробежал\n", this.name);
    }
}
