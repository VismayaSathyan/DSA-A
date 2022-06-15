package com.vismaya;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("enter the character you want to search: ");
        char target = sc.next().charAt(0);
        String ans = stringsearch(sentence, target);
        System.out.println(ans);

    }
    static String stringsearch(String str, char target){
//        if(str.length() == 0){
//            System.out.println("not valid");
//            return "not valid";
//        }
        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)){
               // System.out.println("Matched");
                return "Found";
            }
           // System.out.println("not found");
        }
        return "Not found";
    }
}
