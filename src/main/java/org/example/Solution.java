package org.example;
import java.util.Scanner;

public class Solution {
    public static int temp;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        in.close();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        int[] arr = {a, b, c, d};

        for(int i = 0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
            }

        }

        System.out.println(arr[arr.length-1]-arr[0]);

    }

}
