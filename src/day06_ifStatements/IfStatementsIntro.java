package day06_ifStatements;

public class IfStatementsIntro {

    public static void main(String[] args) {

        int number = -100;

        boolean isPositive = number > 0 ;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;


        if(isPositive){
            System.out.println(number + " is positive number");
        }

        if(isNegative){
            System.out.println(number + " is negative number");
        }    // without if statement this print will be executed regardless everytime it runs but you dont want it

        if(isZero){
            System.out.println(number + " is zero");
        }


        System.out.println("--------------------------------------------------------");

        int num = 100;

        if(num > 0){
            System.out.println(num + " is positive");
        }

        if(num < 0){
            System.out.println(num + " is negative");
        }

        if(num == 0){
            System.out.println(num + " is zero");
        }



    }

}
