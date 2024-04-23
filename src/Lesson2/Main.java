package Lesson2;




public class Main {


    public static void main(String[] args) {
        int z=10;
        int y=5;
        int suma = z+y;
        System.out.println(suma);
        System.out.println();

        System.out.println(Math.random());
        int z1=10;
        System.out.println(z+=5); //ecuatie matematica
        System.out.println(z=+5);  // atribuire valoare noua lui z

        int age = 8;
        System.out.println(5!=5.0);
        if(age<=18){
            System.out.println("Esti student");
        }

        if(age<18 || age == 18){
            System.out.println("Esti student");
        }
        if(age < 18 && age == 18){
            System.out.println("Esti student");
        }

        int virsta = 22;
        if(virsta<21){
            System.out.println("Are mai mult de 21");
        }

        String position = "Automation Tester";
        long automationSalary = 113l;
        long manualSalary = 11l;
        long developerSalary = 199l;

        if(position.equals("Automation Tester")){

            System.out.println("Rise for automation");
            System.out.println(automationSalary *= 2);

        } else if (position.equals("Manual Tester")){

            System.out.println("Rise for manual");
            System.out.println(manualSalary /=2);

        } else if (position.equals("developerSalary")) {

            System.out.println("Rise for developer");
            System.out.println(developerSalary += 1);



        }


    }

}


