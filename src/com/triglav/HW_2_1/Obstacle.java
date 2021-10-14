package com.triglav.HW_2_1;

public abstract class Obstacle {
    private String name;

    public Obstacle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
