package br.edu.univas;

import java.util.Scanner;

public class recursividade_ex08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Type a number: ");

        int number = read.nextInt();

        int result = calcFactorial(number);
            System.out.println(result);
    }
    public static int calcFactorial(int x){
        if(x == 1){
            return 1;
        }
        return x * calcFactorial(x - 1);
    }
}
