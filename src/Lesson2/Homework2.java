package Lesson2;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        // Problem NR1. Write a Java program to get a number from the user and print whether it is positive or negative.
        System.out.println("Insert whole number number bellow: ");
        Scanner number = new Scanner(System.in);
        int number1 = number.nextInt();
        if (number1<0){
            System.out.println("Number is negative");
        } else if(number1 == 0) {
            System.out.println("Number is 0 ");
        } else {
            System.out.println("Number is positive ");
        }

        // Problem NR2. Write a Java program that takes three numbers from the user and prints the greatest number.

        Scanner greatestNumber = new Scanner(System.in);
        System.out.println(" Insert 3 numbers bellow: ");
        int number11 = greatestNumber.nextInt();
        int number12 = greatestNumber.nextInt();
        int number13 = greatestNumber.nextInt();

        if(number11>number12 && number11> number13){
            System.out.println("Number: " +number11 + " is the greatest number");
        } else if(number12>number11 && number12> number13){
            System.out.println("Number: " +number12 + " is the greatest number");
        } else{
            System.out.println("Number " + number13 + " is the greatest number");

        }

        // Problem NR3. Write a Java program that takes a year from the user and prints whether it is a leap year or not.

        Scanner leapYear = new Scanner(System.in);
        System.out.println(" Insert year bellow ");
        int year = leapYear.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a leap year ");
   } else {
            System.out.println(year + " Is NOT a leap year ");
        }

        // Problem NR4. Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

        Scanner sumAndAverage = new Scanner(System.in);
        System.out.println(" Insert 5 numbers bellow ");
        int nr1 = sumAndAverage.nextInt();
        int nr2 = sumAndAverage.nextInt();
        int nr3 = sumAndAverage.nextInt();
        int nr4 = sumAndAverage.nextInt();
        int nr5 = sumAndAverage.nextInt();
        int suma = nr1 + nr2 + nr3 + nr4 + nr5;
        double average = (double) suma /5;


        System.out.println(" The sum of all 5 numbers is: " + suma );
        System.out.println(" The Average of all 5 numbers is: " + average);

        /* Problem NR.5
     a) There is a string "I love Java":
     b) Print the letter at index 4.
     c) Print the index of the letter 'J'. )
     d) Add "and QA Automation" to this phrase (resulting in "I love Java and QA Automation").
     e) Check via boolean if the phrase "I love Java" is of type String. */

        String text = "I love Java";
        System.out.println("The 4th index from text: " + text + " is:" + text.charAt(4));
        System.out.println("The index number for letter J from text: " + text + " is: " +text.indexOf("J"));
        System.out.println(text + " and QA Automation ");

        boolean isString = text instanceof String;

        if(isString){
            System.out.println("I love Java text is of type String");
        } else {
            System.out.println("I love Java text is NOT of type String");
        }
    }
}
