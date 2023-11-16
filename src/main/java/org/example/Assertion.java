package org.example;

import java.util.Scanner;

public class Assertion {
    private boolean marks;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks");

        int marks = sc.nextInt();
        sc.close();
        assert marks >= 40 : "Failed" ; //(Actual Condition : Expected Condition)

        //System.out.println(marks);
    }

}
