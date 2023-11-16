package org.example;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a string to be reversed: ");
        String input=sc.nextLine();
        sc.close();
       System.out.println(reverser(input));

    }
    public static String reverser(String input){
        String result = "";
        for(int i = input.length()-1; i >=0; i--){
            result += input.charAt(i);
        }
        return result;
    }
}
