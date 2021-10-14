package com.triglav.HW_2_1;

public class Wall extends Obstacle{
    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
