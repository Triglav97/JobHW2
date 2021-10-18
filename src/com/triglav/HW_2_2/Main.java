package com.triglav.HW_2_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[][] arrTrue = {{"1","2","3","4"},
                                {"1","2","3","4"},
                                {"1","2","3","4"},
                                {"1","2","3","4"}};
        String[][] arrFalse = {{"1","2","3","4"},
                                {"1","2"},
                                {"1","2","3","4"},
                                {"1","2","3","4"}};
        String[][] arr2False = {{"1","2","3","4"},
                                {"1","2","3","4"},
                                {"1","2","imposter","4"},
                                {"1","2","3","4"}};
        for (String[] i: arrTrue) {
            for (String k : i){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println(arrTrue.length);

//        try {
//            int i = 0;
//            if (i==0) {
//                throw new MyArraySizeException("параметр");
//            }
//        }catch (MyArraySizeException e){
//            System.out.println(e.getMessage() + " прошло");
//        }

        try{
            method(arr2False);
        }catch (MyArraySizeException e) {
            e.printStackTrace();
        }

    }

    public static void method(String[][] arr) throws MyArraySizeException{
        if (arr.length != 4) {
            throw new MyArraySizeException("Не верный размер массива");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Не верный размер массива");
            }
        }
    }
}
