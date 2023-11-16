package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Input word here: ");
        String string = s.nextLine();
        s.close();
        Maps mp=new Maps();
        System.out.println(mp.getScrabbleScore(string));

    }
    public int getScrabbleScore(String string) {
        // TO Write an implementation for this method declaration
        Integer result=0;
        Map<Character, Integer> m=new HashMap<>();
        m.put('A', 1);		m.put('E', 1);		m.put('I', 1);		m.put('O', 1);
        m.put('U', 1);		m.put('L', 1);		m.put('N', 1);		m.put('R', 1);
        m.put('S', 1);		m.put('T', 1);		m.put('D', 2);		m.put('G', 2);
        m.put('B', 3);		m.put('C', 3);		m.put('F', 4);		m.put('H', 4);
        m.put('V', 4);		m.put('W', 4);		m.put('Y', 4);		m.put('K', 5);
        m.put('J', 8);		m.put('X', 8);		m.put('Q', 10);		m.put('Z', 10);
        m.put('M', 3);		m.put('P', 3);

        m.put('a', 1);		m.put('e', 1);		m.put('i', 1);		m.put('o', 1);
        m.put('u', 1);		m.put('l', 1);		m.put('n', 1);		m.put('r', 1);
        m.put('s', 1);		m.put('t', 1);		m.put('d', 2);		m.put('g', 2);
        m.put('b', 3);		m.put('c', 3);		m.put('f', 4);		m.put('h', 4);
        m.put('v', 4);		m.put('w', 4);		m.put('y', 4);		m.put('k', 5);
        m.put('j', 8);		m.put('x', 8);		m.put('q', 10);		m.put('z', 10);
        m.put('m', 3);		m.put('p', 3);
        for (int i=0; i<string.length(); i++){

            result += m.get(string.charAt(i));
        }
        return result.intValue();
    }
}
