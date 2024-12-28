package com.github.bgrebennikovv;

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

    }
}