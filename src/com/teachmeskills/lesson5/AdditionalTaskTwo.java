package com.teachmeskills.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dimension of the array: ");
        int num = scanner.nextInt();
        int[][] array = new int[num][num];

        for (int[] i : array) {
            for (int j = 0; j < i.length; j++) {
                i[j] = (int) (Math.random() * 10);
            }
        }

        for (int[] i : array){
            System.out.println(Arrays.toString(i));
        }


        int totalSum = 0;
        for (int[] i : array) {
            for (int j = 0; j < i.length; j++) {
                totalSum += i[j];
            }
        }
        System.out.println("Sum values array: " + totalSum);
    }
}
