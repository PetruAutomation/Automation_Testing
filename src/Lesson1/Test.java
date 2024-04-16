package Lesson1;

import java.util.Scanner;

public class Test {
    //The main method
    // author Pascari Petru
    public static void main(String[] args) {

        String a = "Prima litera din alfabet";
        System.out.println(a);
        int position = 5;
        System.out.println(position);

        System.out.println(7 * 7);
        System.out.println(7 + 4 + " 7+4");

        System.out.println(5.7);

        char caracter = '*';
        System.out.println(caracter);

        double nr1 = 7.46;
        float nr2 = 8.30f;

        double suma = nr1+nr2;
        System.out.println(suma);


       char valoareasci57 = 57;
        System.out.println(valoareasci57);

        String text ="Java";
        System.out.println("Lungimea sirului este = " + text.length());
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.indexOf("a"));

         // Metode de afisare a textului
        System.out.print("Language");
        System.out.print(text);
        System.out.println("Language " + text);
        System.out.println("Language".concat(text));

        Scanner name = new Scanner(System.in);
        System.out.println("Enter name");
        String name1 = name.nextLine();
        System.out.println("Numele este = " + name1);


        Scanner name11 = new Scanner(System.in);
        System.out.println("Enter name");
        int number1 = name11.nextInt();
        int number2 = name11.nextInt();
        System.out.println("numarul este = " + number1 + number2);



    }
}
