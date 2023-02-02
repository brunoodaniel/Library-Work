package br.edu.univas;

import java.util.Scanner;

public class recursividade_ex05 {
    public static void main(String[] args) {
        String result = removingSpaces();
        System.out.println(result);
    }
    public static String removingSpaces(){
        Scanner read = new Scanner(System.in);
        String text = read.nextLine();

        return text.replaceAll("\\s","");
    }
}
