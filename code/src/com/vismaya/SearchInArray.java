package com.vismaya;

import java.util.Arrays;

public class SearchInArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {23, 56, 78},
                {34, 79}
        };
        int target= 11      ;
        int [] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int row =0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }

            return new int[]{-1, -1};
    }
}
