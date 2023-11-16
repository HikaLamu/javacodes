package org.example;
import java.util.*;
public class Capitalize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input string here: ");
        String str=sc.nextLine();
        sc.close();
        System.out.println(c(str));
    }
    public static String c(String str) {
        String one = str.substring(0, 1).toUpperCase();
        String two = str.substring(1);
        String result = one + two;
        return result;
    }

}
