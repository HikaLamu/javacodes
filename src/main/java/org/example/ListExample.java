package org.example;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a string here: ");
        String input = sc.nextLine();
        sc.close();
        ListExample l = new ListExample();
        System.out.println(l.m(input));
        System.out.println(l.mylist.size());
    }
    ArrayList<String> mylist = new ArrayList<>();
    public List m(String input){
        int count = 0;
        while(count < 10){
            mylist.add(input);
            count ++;
        }
        return mylist;
    }
}
