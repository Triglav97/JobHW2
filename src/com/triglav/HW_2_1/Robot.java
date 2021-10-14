package com.triglav.HW_2_1;

public class Robot implements Move{
    private String name;
    private int runDis;
    private int jumpH;

    public Robot(String name) {
        this.name = name;
    }

    public Robot(String name, int runDis, int jumpH) {
        this.name = name;
        this.runDis = runDis;
        this.jumpH = jumpH;
    }

    @Override
    public void jump() {
        System.out.printf("Робот %s прыгнул\n", this.name);

    }

    @Override
    public void run() {
        System.out.printf("Робот %s побежал\n", this.name);
    }

    @Override
    public void jump(int jumpH) {
        System.out.printf("Робот %s может прыгнуть на %d метров\n", this.name, jumpH);
    }

    @Override
    public void run(int runDis) {
        System.out.printf("Робот %s может пробежать на %d метров\n", this.name, runDis);
    }

    @Override
    public int getRunDis() {
        return runDis;
    }

    @Override
    public int getJumpH() {
        return jumpH;
    }
}
