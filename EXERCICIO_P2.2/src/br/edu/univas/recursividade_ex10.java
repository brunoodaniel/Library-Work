package br.edu.univas;

import java.util.Scanner;

public class recursividade_ex10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Which number of Fibonacci serie do you wanna know?");
        int numberOfTheSerie = read.nextInt();

        int result = calc(numberOfTheSerie);
        if (result == 1) {
            System.out.println("The " + numberOfTheSerie + "st" + " number of Fibonacci serie is: " + result);
        }
        else if (result == 2) {
            System.out.println("The " + numberOfTheSerie + "nd" + " number of Fibonacci serie is: " + result);
        }
        else if (result == 3) {
            System.out.println("The " + numberOfTheSerie + "rd" + " number of Fibonacci serie is: " + result);
        } else {
            System.out.println("The " + numberOfTheSerie + "th" + " number of Fibonacci serie is: " + result);
        }
    }

    public static int calc(int n) {
        if (n <= 1) {
            return n;
        }
        return calc(n - 1) + calc(n - 2);
    }
}
