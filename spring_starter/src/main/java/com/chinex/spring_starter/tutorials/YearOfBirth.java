package com.chinex.spring_starter.tutorials;

import java.util.Scanner;

public class YearOfBirth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Enter the current year: ");
        int currentYear = input.nextInt();

        int yearBorn = currentYear - age;
        System.out.println("Your age is: " + age);
        System.out.println("Your were born in the year: " + yearBorn);

        System.out.println("Enter your name: ");
        String myName = input.nextLine();

        System.out.println("My name is " + myName);
    }
}
