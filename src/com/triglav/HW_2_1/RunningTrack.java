package com.triglav.HW_2_1;

public class RunningTrack extends Obstacle{
    private int dist;

    public RunningTrack(String name, int dist) {
        super(name);
        this.dist = dist;
    }

    public int getDist() {
        return dist;
    }
}
