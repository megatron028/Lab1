package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        String abc = "abc";
        int m = 10;
        float gg = 5.5f;
        int[] mas = {1,4,5};
        // Вывод
        System.out.println(abc.charAt(0));
        // Задание массива
        int[] mmm = new int[50];
        // случайные значения
        Random rand = new Random();
        int max = 50;
        int min = 1;
        // цикл
        for(int i = 0;i < mmm.length; i++) {
            mmm[i]= rand.nextInt(max)+min ;
            System.out.print(mmm[i]+" ");
        }
        System.out.println("");
        // вывод цикла
        System.out.print(Arrays.toString(mmm));
    }
}
