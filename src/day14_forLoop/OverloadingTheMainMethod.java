package day14_forLoop;

public class OverloadingTheMainMethod {

    public static void main(String[] args) {

        System.out.println("A");
        main(25); // B
        main(2.05); //C
        main(true); //D

    }
// the main method above is real method comes from java system library all other below are face main methods


    public static void main(int args){

        System.out.println("B");

    }

    public static void main(double args){

        System.out.println("C");

    }

    public static void main(boolean args){

        System.out.println("D");

    }




}
