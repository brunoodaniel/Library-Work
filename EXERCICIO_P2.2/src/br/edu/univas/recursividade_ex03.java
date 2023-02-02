package br.edu.univas;

import java.util.Scanner;

public class recursividade_ex03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        label:
        do{
            System.out.println("************************************");
            System.out.println("Choose one option below" + "\n");
            System.out.println("-Sum");
            System.out.println("-Substraction");
            System.out.println("-Division");
            System.out.println("-Multiplication");
            System.out.println("-Leave");
            System.out.println("\n" + "*****************************************");
            System.out.println("\n");

            String Choose = read.next();

            switch (Choose) {
                case "sum": {
                    System.out.println("Type the first number");
                    double number1 = read.nextDouble();

                    System.out.println("Type the second number");
                    double number2 = read.nextDouble();

                    double result = sum(number1, number2);
                    System.out.println("The sum of " + number1 + " + " + number2 + " is: " + result);
                    break;
                }
                case "substraction": {
                    System.out.println("Type the first number");
                    double number1 = read.nextDouble();

                    System.out.println("Type the second number");
                    double number2 = read.nextDouble();

                    double result = substraction(number1, number2);
                    System.out.println(number1 + " subtracted by " + number2 + " is: " + result);
                    break;
                }
                case "division": {
                    System.out.println("Type the first number");
                    double number1 = read.nextDouble();

                    System.out.println("Type the second number");
                    double number2 = read.nextDouble();

                    double result = division(number1, number2);
                    System.out.println(number1 + " divided by " + number2 + " is: " + result);
                    break;
                }
                case "multiplication": {
                    System.out.println("Type the first number");
                    double number1 = read.nextDouble();

                    System.out.println("Type the second number");
                    double number2 = read.nextDouble();

                    double result = multiplication(number1, number2);
                    System.out.println(number1 + " multiplied by " + number2 + " is: " + result);
                    break;
                }
                case "Leave":
                    break label;
                default:
                    System.out.println("invalid option");
                    break;
            }

        }while(true);


    }
    public static double sum(double number1, double number2){ return number1 + number2;}

    public static double substraction(double number1, double number2){ return number1 - number2;}

    public static double division(double number1, double number2){ return number1 / number2;}

    public static double multiplication(double number1, double number2){ return number1 * number2;}

}
