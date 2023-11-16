package org.example;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Hello World");
        try{
            int a = 10/0;}
            catch(Exception c){
                System.err.println(c.getMessage() +" Message "+ c.getClass());
        }

        System.out.println("Let's see what happens");
    }
}
