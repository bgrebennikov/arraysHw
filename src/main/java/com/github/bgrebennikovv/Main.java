package com.github.bgrebennikovv;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");
        int[] monthlyExpenses = new int[]{11_000, 560, 2_000, 3500, 50};

        int sumOfExpenses = 0;
        for (int i : monthlyExpenses) {
            sumOfExpenses += i;
        }

        System.out.printf("""
                Сумма трат за месяц составила %s рублей
                """, sumOfExpenses);

        // Task 2
        System.out.println("\nTask 2");

        int[] weeklyExpenses = new int[]{1000, 50, 7_100, 6_000, 300};
        int minExpenses = weeklyExpenses[weeklyExpenses.length - 1];
        int maxExpenses = weeklyExpenses[weeklyExpenses.length - 1];
        for (int ex : weeklyExpenses) {
            minExpenses = (ex < minExpenses) ? ex : minExpenses;
            maxExpenses = (ex > maxExpenses) ? ex : maxExpenses;
        }

        System.out.printf("""
                Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей
                """, minExpenses, maxExpenses);

        // Task 3
        System.out.println("\nTask 3");
        int[] expenses = {200, 11_000, 2_500, 400, 650};

        int total = 0;
        for (int ex : expenses) {
            total += ex;
        }

        double average = (double) total / expenses.length;

        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n", average);

        // Task 4
        System.out.println("\nTask 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        int left = 0;
        int right = reverseFullName.length - 1;

        while (left < right) {
            char tmp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = tmp;

            left++;
            right--;
        }

        System.out.println(new String(reverseFullName));

    }
}