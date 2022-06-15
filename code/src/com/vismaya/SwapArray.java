package com.vismaya;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any 5 numbers: ");
        int [] arr = new int[5];
        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        System.out.print("Enter an Index one from 0-4: ");
//        int index1 = in.nextInt();
//        System.out.print("Enter an Index two from 0-4: ");
//        int index2 = in.nextInt();
        //swap(arr,index1,index2);
        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
    }

    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
