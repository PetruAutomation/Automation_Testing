package Lesson1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Homework {
    public static void main(String[] args) {

        // Problem NR 1: Write a program to find square of a number.

        Scanner squareroot = new Scanner(System.in);
        System.out.println("Enter number to find out square root");
        int number1 = squareroot.nextInt();
        int square = number1 * number1;
        System.out.println("Square of " + number1 +" = " + square);

        // Problem NR2 : Write a program to take 2 integer numbers inputs from user and print sum and product of them.

        Scanner sumProduct = new Scanner(System.in);
        System.out.println("Enter first number");
        int numberforsum1 =  sumProduct.nextInt();
        System.out.println("Enter second number");
        int numberforsum2 = sumProduct.nextInt();

        int sum = numberforsum1 + numberforsum2;
        int product = numberforsum1 * numberforsum2;

        System.out.println("Sum of " + numberforsum1 + " and " + numberforsum2 + " = " +sum);
        System.out.println("Product of " + numberforsum1 + " and " + numberforsum2 + " = " +product);

        // Problem NR3 : Read side of a square from user and print area and perimeter of it

        Scanner squarearea = new Scanner(System.in);
        System.out.println(" Enter length of side of a square ");
        int sideLength = squarearea.nextInt();

        int area = sideLength * sideLength;
        int perimeter = 4 * sideLength;

        System.out.println("Area of square for side length " + sideLength + " is " + area);
        System.out.println("Perimeter of square for side length " + sideLength + " is " + perimeter);







    }
}
