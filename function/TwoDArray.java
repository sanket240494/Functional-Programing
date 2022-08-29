package com.function;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int row;
        int column;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Row's : ");
        row = sc.nextInt();
        System.out.println("Enter The Number Of Column's : ");
        column = sc.nextInt();
        int[][] twoDArray = new int[row][column];
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.println("Enter Element Value for [" + i + "]" + "[" + j + "]");
                int ele = sc.nextInt();
                twoDArray[i][j] = ele;

            }
        }
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.println(twoDArray[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
