package com.function;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x value in int:");
        int x = sc.nextInt();
        System.out.println("Enter y value in int:");
        int y = sc.nextInt();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("the Euclidean distance from the point (" + x + ", " + y + ") to the origin (0, 0)is:" + distance);

    }

}

