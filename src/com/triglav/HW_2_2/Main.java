package com.triglav.HW_2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<String[][]> arrays = new ArrayList<>();
        arrays.add(arrTrue);
        arrays.add(arrFalse);
        arrays.add(arr2False);

        for(String[][] arr : arrays){
            viewArr(arr);
            try {
                try{
                    int res = method(arr);
                    System.out.println("Сумма значений массива равна: " + res);
                }catch (MyArraySizeException e) {
                    System.out.println(e.getMessage());
                }
            } catch (MyArrayDataException e) {
                System.out.println(e.getMessage());
                System.out.println("в ячейке: [" + e.getI() + "][" + e.getJ() + "]");
            }
            System.out.println();
        }
    }

    public static void viewArr(String [][] arr){
        for (String[] i : arr) {
            for (String k : i) {
                System.out.print(k + " ");
            }
            System.out.println(" размер строки: " + i.length);
        }
        System.out.println("кол-во строк: " + arr.length);
    }

    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        int res = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Не верный размер массива");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Не верный размер массива");
            }
            for (int j=0;j< arr.length; j++){
                try{
                    res = res + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return res;
    }
}
