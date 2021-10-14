package com.triglav.HW_2_1;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Stive");
        Cat cat = new Cat("Pushistik");
        Robot robot = new Robot("Bimo");

        human.jump();
        human.run();
        cat.jump();
        cat.run();
        robot.jump();
        robot.run();
    }
}
