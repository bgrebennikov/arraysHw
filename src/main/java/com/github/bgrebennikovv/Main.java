package com.github.bgrebennikovv;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");

        int[] numbersArray = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(numbersArray));

        double[] doubleArray = new double[3];
        doubleArray[0] = 1.57;
        doubleArray[1] = 7.654;
        doubleArray[2] = 9.986;
        System.out.println(Arrays.toString(doubleArray));

        byte[] byteArray = new byte[16];
        Random random = new Random();
        for (int i = 0; i < random.nextInt(byteArray.length); i++) {
            byteArray[i] = (byte) random.nextInt(128);
        }
        System.out.println(Arrays.toString(byteArray));


    }
}