package com.chinex.spring_starter.tutorials;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the First Number: ");
        float firstNumber = input.nextFloat();

        System.out.println("Please Enter the second Number: ");
        double secondNumber = input.nextDouble();

        System.out.println("Please Enter the third Number: ");
        double thirdNumber = input.nextDouble();

        double sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("The sum of the three numbers is: " + sum);

        double avg = sum / 3;
        System.out.println("The average of the three numbers is: " + avg);
    }
}
