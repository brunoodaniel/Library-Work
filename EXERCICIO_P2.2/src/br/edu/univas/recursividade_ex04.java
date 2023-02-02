package br.edu.univas;

import java.util.Scanner;

public class recursividade_ex04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number1 = read.nextInt();

        System.out.println("Typr another number: ");
        int number2 = read.nextInt();

        int result = count(number1, number2);
        System.out.println("The biggest number typed was: "+result);
    }
    public static int count(int number1, int number2) {
        return Math.max(number1, number2);
    }
}
