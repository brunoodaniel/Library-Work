package br.edu.univas;

import java.util.Scanner;

public class recursividade_ex06 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[] averageOfEachMonth = new double[12];
        for(int i = 0; i < 12; i++){
            System.out.println("Type the average temperature for the month "+"("+(i+1)+")");
            averageOfEachMonth[i] = read.nextDouble();
        }

        double totalAverage = sumOfTheTemperatures(averageOfEachMonth);
        double generalAverage = calcGeneralAverage(totalAverage);
        double[] arrayChange = calcArrayChange(averageOfEachMonth, generalAverage);
        System.out.println("Annual average: "+generalAverage);
        for(int j = 0; j < 12; j++){
            if(arrayChange[j] == -1){
                System.out.println("Average of the month "+"("+(j+1)+")"+" is bellow the annual average");
            }
            else if(arrayChange[j] == 0){
                System.out.println("Average of the month "+"("+(j+1)+")"+" is equal to annual average");
            }
            else{
                System.out.println("Average of the month "+"("+(j+1)+")"+" is above the annual average");
            }
        }
    }
    public static double sumOfTheTemperatures(double[] averageOfEachMonth){
        double sum = 0;
        for(int i = 0; i < 12; i++){
            sum += averageOfEachMonth[i];
        }
        return sum;
    }
    public static double calcGeneralAverage(double totalAverage){

        return totalAverage/12;
    }
    public static double[] calcArrayChange(double[] averageOfEachMonth, double generalAverage){
        for(int i = 0; i < 12; i++){
            if(averageOfEachMonth[i] < generalAverage){
                averageOfEachMonth[i] = -1;
            }
            else if(averageOfEachMonth[i] == generalAverage){
                averageOfEachMonth[i] = 0;
            }
            else {
                averageOfEachMonth[i] = 1;
            }
        }
        return averageOfEachMonth;
    }
}
