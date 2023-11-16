package org.example;
import java.util.*;

public class Scrabble2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Input word here: ");
        String word = s.nextLine();
        s.close();
        Scrabble2 sc2=new Scrabble2(word);
        System.out.println(sc2.getScore());

    }
    private final int score;

    Scrabble2(String word) {
        word = word.toUpperCase();
        int score = 0;

        for (int i = 0; i < word.length(); i++) {
            var ltr = word.substring(i, i + 1);
            if ("AEIOULNRST".contains(ltr))
                score += 1;
            else if ("DG".contains(ltr))
                score += 2;
            else if ("BCMP".contains(ltr))
                score += 3;
            else if ("FHVWY".contains(ltr))
                score += 4;
            else if ("K".contains(ltr))
                score += 5;
            else if ("JX".contains(ltr))
                score += 8;
            else if ("QZ".contains(ltr))
                score += 10;
        }
        this.score = score;
    }

    int getScore() {
        return score;
    }
}
