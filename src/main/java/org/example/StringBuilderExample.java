package org.example;
import java.util.*;

public class StringBuilderExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a string to be reversed: ");
        String str=sc.nextLine();
        sc.close();
        StringBuilderExample s=new StringBuilderExample();
        System.out.println(s.reversing(str));
    }
    StringBuilder result;
    //String result
    public StringBuilder /*String*/ reversing(String str) {
        StringBuilder sb = new StringBuilder(str);
        result = sb.reverse();
        //result = String.ValueOf(sb.reverse()):
        return result;
    }
}
