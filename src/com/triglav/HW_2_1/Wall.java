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

    @Override
    protected boolean challenge(Move person) {
        System.out.println(super.getName() + " расстояние: " + this.height);
        person.run();

        if(getHeight() <= person.getJumpH()){
            System.out.println("прошел");
            return true;
        } else {
            System.out.println("не прошел(");
            return false;
        }
    }
}
