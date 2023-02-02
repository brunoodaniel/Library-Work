package br.edu.univas;

import java.util.Scanner;

public class recursividade_ex02 {
    public static void main(String[] args) {
        int birthdayYear = readBirthdayYear();
        int age = calcAge(birthdayYear);
        System.out.println("Your age is: "+age);
    }
    public static int readBirthdayYear(){
        Scanner read = new Scanner(System.in);
        System.out.println("Please type your birthday");
        return read.nextInt();

    }
    public static int calcAge(int birthdayYear){
        return 2022 - birthdayYear;
    }
}
