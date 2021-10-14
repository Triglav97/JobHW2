package com.triglav.HW_2_1;

public interface Move {
    void jump();
    void run();
    void jump(int jumpH);
    void run(int runDis);
    int getRunDis();
    int getJumpH();
}
