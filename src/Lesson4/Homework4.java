package Lesson4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        // 1.Write a Java program to reverse an array of integers.

        int[] array1 = {3, 6, 4, 2, 1, 5, 7, 9, 8};
        for (int i = 0; i < array1.length; i++) {

            System.out.println("All elements off array1 inversed " + " " + array1[array1.length - 1 - i]);
        }

        //  2.Write a Java program to sort an array of integers in ascending and descending order.

        Integer[] array2 = {2, 4, 6, 3, 1, 5, 8, 9, 7};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        System.out.println("---------");
        Arrays.sort(array2, Collections.reverseOrder());
        System.out.println(Arrays.toString(array2));


        //  3.Write a Java program to find the intersection of two arrays (common elements).

        int[] intersectArray1 = {3, 1, 6, 2, 3, 9, 3, 1};
        int[] intersectArray2 = {5, 3, 7, 6, 3, 6, 0, 6};

        for (int k = 0; k < intersectArray1.length; k++) {
            if (intersectArray1[k] == intersectArray2[k]) {
                System.out.println("Arrays intersect at index : " + k);
                System.out.println("Arrays intersect at number : " + intersectArray1[k]);
            }
        }

        // 4.Write a Java program to calculate the average of all elements in an integer array.

        int[] averageArray = {5, 4, 7, 4, 8, 3, 5, 7, 8, 9};
        int sum = 0;
        double average = 0;
        for (int h = 0; h < averageArray.length; h++) {
            sum += averageArray[h];
        }
        System.out.println("Sum of array is " + sum);
        average = (double) sum / averageArray.length;
        System.out.println("Average of array is " + average);

        // 5.Write a Java program to search for a specific element in an array and return its index.

        int[] elementArray = {3, 6, 8, 2, 7, 1, 5, 4, 9};
        Scanner array = new Scanner(System.in);
        System.out.println("Enter number from 1 to 9 to return its index ");
        int number = array.nextInt();

        for (int l = 0; l < elementArray.length; l++) {
            if (number == elementArray[l]) {
                System.out.println("Number " + number + " is at index " + l);
            }
        }

        // 6.Write a Java program to merge two sorted arrays into a single sorted array.


        int[] sortedArray1 = {11, 12, 13, 14, 15};
        int[] sortedArray2 = {21, 22, 23, 24, 25};
        int[] combinedArray = new int[sortedArray1.length + sortedArray2.length];

        for (int f = 0; f < sortedArray1.length; f++) {
            combinedArray[f] = sortedArray1[f];
        }


        for (int e = 0; e < sortedArray2.length; e++) {
            combinedArray[e + 5] = sortedArray2[e];
        }

        Arrays.sort(combinedArray);
        System.out.println(Arrays.toString(combinedArray));
    }
}
