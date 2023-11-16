package org.example;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Input a word:" );
        String str=s.nextLine();
        s.close();
        System.out.println(pal(str));
    }
    public static boolean pal(String str){
        StringBuilder sb = new StringBuilder(str);

        if(str.equals(String.valueOf(sb.reverse()))){
            return true;
        }
        return false;
    }
}
