package br.edu.univas;

import java.util.Scanner;


public class recursividade_ex01 {
    public static void main(String[] args) {
        String word = readWord();
        word = invertWord(word);
        System.out.println("Inverted word: "+word);

    }

    public static String readWord() {
        Scanner read = new Scanner(System.in);
        System.out.println("Please type a word: ");
        return read.nextLine();
    }
    public static String invertWord(String word){
        String newWord = "";
        for(int i = word.length() - 1; i >= 0; i--){
            newWord += word.charAt(i);
        }
        return newWord;

    }
}