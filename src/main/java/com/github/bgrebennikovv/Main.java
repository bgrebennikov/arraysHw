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

        // Task 2
        System.out.println("\nTask");

        StringBuilder numbersArrayString = new StringBuilder();
        for (int i = 0; i < numbersArray.length; i++) {
            String separator = ", ";
            if (i == numbersArray.length-1) {
                separator = "";
            }
            numbersArrayString.append(String.format("%d%s", numbersArray[i], separator));
        }

        System.out.println(numbersArrayString);

        StringBuilder doubleArrayString = new StringBuilder();
        for (int i = 0; i < doubleArray.length; i++) {
            String separator = ", ";
            if (i == doubleArray.length-1) {
                separator = "";
            }
            doubleArrayString.append(String.format("%s%s", doubleArray[i], separator));
        }

        System.out.println(doubleArrayString);

        StringBuilder byteArrayString = new StringBuilder();
        for (int i = 0; i < byteArray.length; i++) {
            String separator = ", ";
            if (i == byteArray.length-1) {
                separator = "";
            }
            byteArrayString.append(String.format("%s%s", byteArray[i], separator));
        }

        System.out.println(byteArrayString);


    }
}