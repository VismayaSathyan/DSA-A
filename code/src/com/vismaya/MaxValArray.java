package com.vismaya;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any 5 numbers");
        int [] arr = new int[5];
        for (int i = 0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the range");
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(maxRange(arr, start, end));
    }

    static int max(int[] arr){
        int maxVal = arr[0];
    for(int i = 1; i< arr.length; i++){
        if (arr[i]>arr[0]) {
            maxVal = arr[i];
        }
    }
        return maxVal;
    }

    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for(int i = start; i< end ; i++){
            if (arr[i]>arr[start]) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
