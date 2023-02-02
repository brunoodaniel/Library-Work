package br.edu.univas;

import java.util.Scanner;

public class recursividade_ex09 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("Type the base: ");
        int base = read.nextInt();

        System.out.println("Type the exponent: ");
        int exponent = read.nextInt();

        int power = calcPower(base, exponent);
            System.out.println(power);
    }
    public static int calcPower(int base, int exponent){
        if(exponent == 1){
            return base;
        }
        return base * calcPower(base,exponent - 1);
    }
}
