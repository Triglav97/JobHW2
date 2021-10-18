package com.triglav.HW_2_3;

public class MyValidE extends Exception{
    private static final String str = "Не прошел валидацию";

    MyValidE(String msg){
        super(str + "\n" + msg);
    }
}
