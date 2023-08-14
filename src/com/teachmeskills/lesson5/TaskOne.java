package com.teachmeskills.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        System.out.print("Enter the dimension of the array: ");
        int scan = new Scanner(System.in).nextInt();

        int[][][] array = new int[scan][scan][scan];

        for (int[][] i : array) {
            for (int[] j : i) {
                for (int k = 0; k < j.length; k++) {
                    j[k] = (int) (Math.random() * 10);
                }
            }
        }

        System.out.println("com.teachmeskills.lesson5.TaskOne: " + Arrays.deepToString(array));

        System.out.print("Enter a number to increase the array: ");
        int count = new Scanner(System.in).nextInt();

        for (int[][] i : array) {
            for (int[] j : i) {
                for (int k = 0; k < j.length; k++ ) {
                    j[k] += count;
                }
            }
        }

        System.out.println("Массив после увеличения: " + Arrays.deepToString(array));

    }

}

