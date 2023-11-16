package org.example;

public class Acronyms {
    public static void main(String[] args) {
        Acronyms ac = new Acronyms();
        System.out.println(ac.acronym("Oromo Libration Front"));

    }
    public String acronym(String phrase) {
        String acr="";
        String f= String.valueOf(phrase.charAt(0));
        for(int i=0; i<phrase.length(); i++){
            if(i>0 && phrase.charAt(i-1)==(' ')){
                acr += phrase.charAt(i);
            }
        }
        return (f+acr).toUpperCase();
    }
}
