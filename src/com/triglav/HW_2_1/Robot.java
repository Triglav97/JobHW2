package com.triglav.HW_2_1;

public class Robot implements Move{
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.printf("Робот %s прыгнул\n", this.name);

    }

    @Override
    public void run() {
        System.out.printf("Робот %s пробежал\n", this.name);
    }
}
