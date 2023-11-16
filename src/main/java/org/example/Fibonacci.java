package org.example;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        fib(n);
    }
    public static void fib(int n){
       // int counter = 0;
        int num1;
        int num2 ;
        int num3;

        for(int i=0; i<=n; i++){
            num1 = 0;
            num2 = 1;
            num3 = num1 + num2;
            System.out.print(num1 + " "+ num2+" "+num3+ " ");
            num1 =num2;
            num2= num3;
        }
    }
}
