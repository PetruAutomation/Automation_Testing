package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[] test = { 10, 11, 35, 51, 523};
//
//        for(int i = 0; i< test.length; i++){
//            System.out.println(i); // indicile array-ului
//
//            System.out.println(test[i]); // numerele din array
//
//            System.out.println(test[4]); // arata numarul de pe indexul 4
//
//            System.out.println(test[i+2]); // incepe a arata numerele incepind cu indexul 2 (0+2)


//        int[] array1 = { 10, 5, 30, 7, 9};
//        int[] array2 = { 2, 3, 7, 4, 3};
//
//        for(int i = 0; i<array1.length; i++ )
//        {
//            System.out.print ("Suma este: ");
//            System.out.println(array1[i] + array2[i]);
//
//        }
//        int max = array1[0];//30
//        for(int k = 1; k<array1.length; k++ ) {
//            max = Math.max(max, array1[k]);
//        }
//        System.out.println(max);

//        String [] array = {"Java", "C++", "Pascal", "Python"};
//        //for (int h=0; h<array.length; h++);
//        for (String h:array){  // forma simplificata pentru for
//            System.out.println(h);
//
//        }


//        int array[]={3,7,8,9};
//        System.out.println(array[array.length-1]); //arata ultimu element din lista (-1)
//        System.out.println(array[array.length-2]); // arata penultimu element din lista

//        Scanner array = new Scanner(System.in);
//        System.out.println("Enter numbers for array");
//        int [] nr = new int[4];
//
//        for (int i = 0; i<nr.length; i++){
//            System.out.println("Enter nr: ");
//            nr[i] = array.nextInt();
//            System.out.println(nr[i]);
//        }

        //  System.out.println((Arrays.toString(nr)));

//        int[][][] arrayMultidimensional = {{{1, 2, 3, 5, 4}, {6, 3, 7, 9}, {5, 1, 6}}};
//        System.out.println(arrayMultidimensional[0][2][1]); // 1- numaru la array, 2- indexu din array

        int[] array = {3, 6, 9, 3, 4, 3};
        int sum1 = 0;
        int sum2 = 0;


        for (int i = 0; i < array.length -3 ; i++) {
            sum1 += array[i];
        }
        System.out.println("Sum of first 3 numbers is: " + sum1);
        for (int i = 3; i < array.length; i++) {
            sum2 += array[i];
        }
        System.out.println("Sum of last 3 numbers is: " + sum2);

        if (sum1 == sum2) {
            System.out.println("You Won!");
        } else {
            System.out.println("You Lost! Try Again");

        }


        int suma1 = 0;
        int suma2 = 0;
        int[] copy1 = Arrays.copyOfRange(array, 0, 3);
        for (int j : copy1)
            suma1 += j;
        System.out.println("First array: " + suma1);


        int[] copy2 = Arrays.copyOfRange(array, 3, 6);
        for (int j : copy2)
            suma2 += j;
        System.out.println("Second array: " + suma2);

        if (suma1 == suma2) {
            System.out.println("Esti norocos");
        } else {
            System.out.println("Mai incearca");
        }


    }
}
