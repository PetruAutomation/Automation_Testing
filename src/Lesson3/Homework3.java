package Lesson3;

import java.util.Objects;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        // Problem 1. Write a program to read gender(M/F) and print the corresponding gender using a switch statement
        Scanner gender = new Scanner(System.in);
        System.out.println("Enter gender using letters M or F: ");
        String insertGender = gender.nextLine();


        switch (insertGender) {
            case ("M"):
                System.out.println("Gender is Male");
                break;

            case ("F"):
                System.out.println("Gender is Female");
                break;
        }


        //Problem 2 Write a program to create simple calculator using switch Statement

        Scanner calculator = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double number1 = calculator.nextDouble();
        System.out.println("Enter the needed operation: +, -, *, /");
        char operation = calculator.next().charAt(0);
        System.out.println("Enter second number: ");
        double number2 = calculator.nextDouble();

        double result = 0;

        switch (operation) {
            case '+':
                result = number1 + number2;
                System.out.println("The result is: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("The result is: " + result);
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Division by 0 is not possible");
                } else {
                    result = number1 / number2;
                    System.out.println("The result is: " + result);
                    break;
                }


        }

       // Problem 3. Write a program to find the Maximum of Two Numbers using switch statement
        Scanner maximumOf2Numbers = new Scanner(System.in);
        System.out.println("Enter the first and second number: ");

        double number11 = maximumOf2Numbers.nextInt();
        double number12 = maximumOf2Numbers.nextInt();

        switch((number11>number12) ? 1 : (number11<number12) ? 2 : 3){
            case 1:
                System.out.println("Maximum number is: " +number11);
                break;
            case 2:
                System.out.println("Maximum number is " +number12);
                break;
            case 3:
                System.out.println("Numbers are equal ");
                break;
         }
        // Problem 4. Write a Java program that calculates the factorial of a given
        // non-negative integer using a while loop. The factorial of a non-negative
        // integer n, denoted by n!, is the product of all positive integers less than or equal to n.

        Scanner factorialNr = new Scanner(System.in);
        System.out.println("Insert number to calculate factorial: ");
        int n = factorialNr.nextInt();
        int i = 1;
        int factorial = 1;
        while (n >= i) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial number  of " + n + " is: " + factorial);


        // Problem 5. Display multiplication table for number 3
        int numberMultiplication = 3;
        int limitMultiplication = 10;

        System.out.println("Multiplication table for number:  " + numberMultiplication);

        for (int j = 1; j <= limitMultiplication; j++) {
            System.out.println(numberMultiplication + " * " + j + " = " + (numberMultiplication * j));
        }

        // Problem 6.Write a program where the user enters any positive integer.
        // The program then calculates the sum of all numbers from 1 to the number entered by the user.

        Scanner sumNumberEntered = new Scanner(System.in);
        System.out.println("Enter number to calculate sum of");
        int numberToCalculate = sumNumberEntered.nextInt();
        int totalOfNumber = 0;
        for (int k = 1; k <= numberToCalculate; k++) {
            totalOfNumber += k;
            System.out.println(totalOfNumber);
        }
        System.out.println("The sum of all numbers from 1 to  " + numberToCalculate + " is " + totalOfNumber);

        // Problem 7. The program should display the following sequence on the screen:7 14 21 28 35 42 49 56 63 70 77 84 91 98

        for (int q = 7; q < 99; q = q + 7) {
            System.out.println(q);
        }
    }
}

