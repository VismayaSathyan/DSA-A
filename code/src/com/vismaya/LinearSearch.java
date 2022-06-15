package com.vismaya;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.print("Enter the number of elements you want in the array: ");
                int n = in.nextInt();
                if(n<=0) {
                    System.out.println("not valid");
                    return;
                }
            System.out.println("Input numbers: ");
            ArrayList<Integer> arr = new ArrayList<>(4);
                int i = 1;
                    while( i <= n) {
                        if(i > n ){
                            System.out.println("Number Limit exceeded");
                            return;
                        }
                    arr.add(in.nextInt());
                     i++;
                 }
                    System.out.print("Enter the number you want to search: ");
                    int target = in.nextInt();
                    boolean ans = linearSearch(arr,target);
                    System.out.println(ans);

    }

    static boolean linearSearch(ArrayList<Integer> arrr, int target ){
//        if(arrr.size() == 0){
//            return false;
//        }

        for(int element: arrr){
            if(element == target){
                return true;
            }
        }
        return false;
    }
}
//    int [] arry = {4, 5, 78 ,89, 78, 90, 100, 67, 56, 45};
//    String cont = "";
//    System.out.println("Do you want to continue type yes/no?");
//    cont = in.next();