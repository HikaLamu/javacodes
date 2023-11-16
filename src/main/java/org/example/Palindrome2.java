package org.example;
import java.util.*;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Input string here: ");
        String str=s.nextLine();
        s.close();
        System.out.println(m(str));
    }
    public static boolean m(String str){
        String backword = "";
        for(int i = str.length()-1; i>=0; i--){
            backword += str.charAt(i);
        }
        if(str.equals(backword)){
            return true;
        }
        return false;
    }
}
