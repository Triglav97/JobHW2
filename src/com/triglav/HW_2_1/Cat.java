package com.triglav.HW_2_1;

public class Cat implements Move{
    private String name;
    private int runDis;
    private int jumpH;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int runDis, int jumpH) {
        this.name = name;
        this.runDis = runDis;
        this.jumpH = jumpH;
    }

    @Override
    public void jump() {
        System.out.printf("Кот %s прыгнул\n", this.name);
    }

    @Override
    public void run() {
        System.out.printf("Кот %s побежал\n", this.name);
    }

    @Override
    public void jump(int jumpH) {
        System.out.printf("Кот %s может прыгнуть на %d метров\n", this.name, jumpH);
    }

    @Override
    public void run(int runDis) {
        System.out.printf("Кот %s может прыгнуть на %d метров\n", this.name, runDis);
    }

    @Override
    public int getRunDis() {
        return runDis;
    }

    @Override
    public int getJumpH() {
        return jumpH;
    }

    @Override
    public String getName() {
        return name;
    }
}
