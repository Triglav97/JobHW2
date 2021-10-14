package com.triglav.HW_2_1;

public class Cat implements Move{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.printf("Кот %s прыгнул\n", this.name);
    }

    @Override
    public void run() {
        System.out.printf("Кот %s пробежал\n", this.name);
    }
}
