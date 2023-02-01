package com.chinex.spring_starter.tutorials.methods;

public class Main {

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int max(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) {
            return  firstNumber;
        } else {
            return secondNumber;
        }
    }

    public static void printGrade(double grade) {
        if (grade >= 90) {
            System.out.println("A");
        }
        else if (grade >= 80) {
            System.out.println("B");
        }
        else if(grade >= 70) {
            System.out.println("C");
        }
        else if (grade >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }

    public static void main(String[] args) {
        int sum = addNumbers(10, 8);
        System.out.println("The sum of the numbers is :" + sum);
        System.out.println("The sum of the numbers is :" + addNumbers(10, 8));
        System.out.println("The maximum of two integers is: " + max(17, 60));
        printGrade(59);

    }
}
