package Lesson3;

public class Main {

    public static void main(String[] args) {
        String curs = "QA Java Automation";

        switch (curs) {
            case ("testing"):
                System.out.println("Esti la curs de testare"); //daca nu avem brake v-a executa tot dupa primul TRUE
                break;

            case ("Automation"):
                System.out.println("maladet");
                break;

            case ("QA Java Automation"):
                System.out.println("Cel mai bravo");
                break;
        }
//        int price = 555;
//
//        switch (price) {
//            case (521):
//                System.out.println("Pretul este 521"); //daca nu avem brake v-a executa tot dupa primul TRUE
//                break;
//
//            case (555):
//                System.out.println("pretul este 555, cumparam");
//                break;
//
//            case (125):
//                System.out.println("11111111123124124");
//                break;
//
//        }

//        int i = 10;
//        while(i<15){
//            System.out.println(i);
//            i++;
//
//        }

//        int i = 10;
//        do{
//            i++;
//            System.out.println(i);
//
//        } while(i<15);


//     int i = 10;
//        do{
//            i--;
//            System.out.println(i);
//
//        } while(i!=1);

        for (int i = 0; i < 5; i++) {
            System.out.println("I" + " " + i);
        }

        for (int j = 0; j < 10; j = j + 2) {
            System.out.println("J" + " " + j);
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                continue; // skip la 5
            }
            System.out.println(i);
        }


    }
}
