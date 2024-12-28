package com.github.bgrebennikovv;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;


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
        System.out.println("\nTask 2");

        System.out.println(displayArray(numbersArray));
        System.out.println(displayArray(doubleArray));
        System.out.println(displayArray(byteArray));

        // Task 3
        System.out.println("\nTask 3");

        System.out.println(displayArray(reverseArray(numbersArray)));
        System.out.println(displayArray(reverseArray(doubleArray)));
        System.out.println(displayArray(reverseArray(byteArray)));

        // Task 4
        System.out.println("\nTask 4");

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = (numbersArray[i] % 2 != 0) ? numbersArray[i] + 1 : numbersArray[i];
        }
        System.out.println(Arrays.toString(numbersArray));


    }

    public static int[] reverseArray(int[] array) {
        return IntStream.range(0, array.length)
                .map(index -> array[array.length - 1 - index])
                .toArray();
    }

    public static String displayArray(int[] array) {
        StringBuilder arrayString = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            String separator = (i == array.length - 1) ? "" : ", ";
            arrayString.append(array[i]).append(separator);
        }
        return arrayString.toString();
    }

    public static double[] reverseArray(double[] array) {
        return IntStream.range(0, array.length)
                .mapToDouble(index -> array[array.length - 1 - index])
                .toArray();
    }

    public static String displayArray(double[] array) {
        StringBuilder arrayString = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            String separator = (i == array.length - 1) ? "" : ", ";
            arrayString.append(array[i]).append(separator);
        }
        return arrayString.toString();
    }

    public static byte[] reverseArray(byte[] array) {
        byte[] reversedArray = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public static String displayArray(byte[] array) {
        StringBuilder arrayString = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            String separator = (i == array.length - 1) ? "" : ", ";
            arrayString.append(array[i]).append(separator);
        }
        return arrayString.toString();
    }

}