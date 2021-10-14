package com.triglav.HW_2_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final int rn = 10;
        Random rand = new Random();

        Human human = new Human("Stive", rand.nextInt(rn), rand.nextInt(rn));
        Cat cat = new Cat("Pushistik", rand.nextInt(rn), rand.nextInt(rn));
        Robot robot = new Robot("Bimo", rand.nextInt(rn), rand.nextInt(rn));

        List<Move> persons = new ArrayList<>(Arrays.asList(human, cat, robot));

        int obstaclesCount = rand.nextInt(rn-2) + 2;  // для того, чтобы было больше или равно 2 препятствиям
        System.out.println("Всего препятствий: " + obstaclesCount);
        List<Obstacle> obstacles = new ArrayList<>(obstaclesCount);

        for (int i = 1; i <= obstaclesCount; i++){
            if(rand.nextBoolean()){
                obstacles.add(new RunningTrack("Беговая дорога, препятствие номер " + i, rand.nextInt(rn-5) + 2));
            }else{
                obstacles.add(new Wall("Стена, перпятствие номер " + i, rand.nextInt(rn-5) + 2));
            }
        }
        System.out.println();
        for(Obstacle obstacle : obstacles){
            if(obstacle.getClass() == RunningTrack.class){
                System.out.println(obstacle.getName()+ " расстояние: " + ((RunningTrack) obstacle).getDist());
            }else{
                System.out.println(obstacle.getName()+ " расстояние: " + ((Wall) obstacle).getHeight());
            }
        }
        System.out.println();
        for ( Move person : persons){
            person.jump(person.getJumpH());
            person.run(person.getRunDis());
        }

        System.out.print("\nИспытания начались!!!!\n\n");
        for(Move person : persons){
            boolean res = true;
            for(Obstacle obstacle : obstacles){
                res = obstacle.challenge(person);
                if(!res){
                    System.out.println(person.getName()+ " не смог пройти " + obstacle.getName());
                    break;
                }
            }
            if(res){
                System.out.println(person.getName() + " справился с испытанием!!!!");
            }
            System.out.println("___________________________________________");
        }

    }
}
