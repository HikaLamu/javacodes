package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hashh {
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<Character>> m = new HashMap<Integer, ArrayList<Character>>();
		ArrayList<Character> one = new ArrayList<Character>(){
			{
				add('a'); add('e'); add('i'); add('o'); add('u'); add('l'); add('n'); add('r'); add('s'); add('t');
			}
		};
		ArrayList<Character> two = new ArrayList<Character>(){
			{
				add('d'); add('g');
			}
		};
		ArrayList<Character> three = new ArrayList<Character>(){
			{
				add('b'); add('c'); add('p'); add('m');
			}
		};
		ArrayList<Character> four = new ArrayList<Character>(){
			{
				add('f'); add('h'); add('v'); add('w'); add('y');
			}
		};
		ArrayList<Character> five = new ArrayList<Character>(){
			{
				add('k');
			}
		};
		ArrayList<Character> eight = new ArrayList<Character>(){
			{
				add('j'); add('x');
			}
		};
		ArrayList<Character> ten = new ArrayList<Character>(){
			{
				add('q'); add('z');
			}
		};

		m.put(1, one);
		m.put(2, two);
		m.put(3, three);
		m.put(4, four);
		m.put(5, five);
		m.put(8, eight);
		m.put(10, ten);
        List<Character> result = m.get(1);

        for (Character i : result){
            System.out.print(i + ", ");
        }
    }

}
