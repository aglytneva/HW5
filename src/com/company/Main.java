package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // для собственного понимания
        System.out.println("Для проверки");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("/n");
// Задание 1
        System.out.println("Задание 1.");
        int sumPerMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            sumPerMonth += arr[i];
            if (i == arr.length - 1) {
                System.out.println("Сумма трат за месяц составила " + sumPerMonth + " рублей.");
            }
        }
        // Задание 2
        System.out.println("Задание 2.");
        int maxSum = -1;
        for (final int current : arr) {
            if (current > maxSum) {
                maxSum = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей.");
        int minSum = 500000;
        for (final int current :arr) {
            if (current < minSum) {
                minSum = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minSum+" рублей.");
        // Задание 3
        System.out.println("Задание 3.");
        int sumPerMonthForAvarage = 0;
        for (int i = 0; i < arr.length; i++) {
            sumPerMonthForAvarage += arr[i];
            float avarageSum = sumPerMonthForAvarage / arr.length;
            if (i == arr.length - 1) {
                System.out.println("Средняя сумма трат в день составила " + avarageSum + " рублей.");
            }
        }
// Задание 4
        System.out.println("Задание 4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
