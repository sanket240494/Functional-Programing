package com.function;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of a :");
        a = sc.nextDouble();
        System.out.println("Enter The Value of b :");
        b = sc.nextDouble();
        System.out.println("Enter The Value of c :");
        c = sc.nextDouble();
        double d = b * b - 4.0 * a * c;
        if (d > 0.0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The Root are " + r1 + "and" + r2);
        } else if (d == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The Root is " + r1);
        } else {
            System.out.println("Root Are Not Real");
        }
    }
}
