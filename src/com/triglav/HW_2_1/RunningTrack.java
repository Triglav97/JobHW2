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

    @Override
    protected boolean challenge(Move person) {
        System.out.println(super.getName() + " расстояние: " + this.dist);
        person.run();

        if(getDist() <= person.getRunDis()){
            System.out.println("прошел");
            return true;
        } else {
            System.out.println("не прошел(");
            return false;
        }
    }
}
