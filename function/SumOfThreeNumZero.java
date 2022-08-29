package com.function;

import java.util.Scanner;

public class SumOfThreeNumZero {
    public static int findDistanceTriplets(int b[], int lentgth) {
        System.out.println();
        int i;
        int j;
        int k;
        int count = 0;
        for (i = 0; i < lentgth; i++) {
            for (j = i + 1; j < lentgth; j++) {
                for (k = j + 1; k < lentgth; k++) {
                    if (b[i] + b[j] + b[k] == 0){
                        System.out.println(b[i] + " " + b[j] + " " + b[k]);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("Enter Size Of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i<arr.length;i++){
            System.out.println("Enter" + (i + 1) + "Value :");
            arr[i] = sc.nextInt();
        }
        SumOfThreeNumZero t1 = new SumOfThreeNumZero();
        int sum = t1.findDistanceTriplets(arr,size);
        System.out.println("No Of Tripltes : " + sum);
        System.out.println();


    }

}
