package org.example;

import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Input word here: ");
        String word = s.nextLine();
        s.close();
        Scrabble sc=new Scrabble(word);
        System.out.println(sc.getScore());

    }
    private final int score;

    Scrabble(String word) {
        word = word.toLowerCase();
        int score = 0;

        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't':
                    score += 1;
                    break;
                case 'd', 'g':
                    score += 2;
                    break;
                case 'b', 'c', 'm', 'p':
                    score += 3;
                    break;
                case 'f', 'h', 'v', 'w', 'y':
                    score += 4;
                    break;
                case 'k':
                    score += 5;
                    break;
                case 'j', 'x':
                    score += 8;
                    break;
                case 'q', 'z':
                    score += 10;
                    break;
                default:
                    break;
            }
        }
        this.score = score;
    }

    int getScore() {
        return score;
    }
}

