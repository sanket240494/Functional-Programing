package com.function;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        double t ;
        double v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temp(Fahrenheit) Greater than 50");
        t = sc.nextDouble();
        System.out.println("Enter The Wind Speed v (in miles per hour) greater than 120 and less than 3");
        v = sc.nextDouble();
        if (t>50 && v<120 || v>3){
            double w = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v,0.16);
            System.out.println("The Effective Temperature (The Wind Chill) to be : " + " " +w);

        }
        else {
            System.out.println("Enter The Value in Vaild Range");

        }
    }
}
