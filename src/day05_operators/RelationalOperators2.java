package day05_operators;

import java.util.Locale;

public class RelationalOperators2 {
    public static void main(String[] args) {
    // ==:
        System.out.println(1000 == 2000);   // false
        System.out.println("Java" == "Java");  // true
        System.out.println("Java" == "JAVA");  // false
        System.out.println("Muhtar" == "Good guy");  //false
        System.out.println("----------------------------------------------");
        System.out.println("Java".toUpperCase() == "JAVA");  // ?
        System.out.println("////////////////////////////////////////////////////////");
        System.out.println("Java".toUpperCase().equals("JAVA"));
        System.out.println("////////////////////////////////////////////////////////");
        // != :
        System.out.println(1000 != 2000);   // true
        System.out.println("Java" != "Java");  // false
        System.out.println("Java" != "JAVA");  // true
        System.out.println("Muhtar" != "Good guy");  //true
        System.out.println("Java".toUpperCase() != "JAVA");  // !?
        System.out.println(true != false); //true


    }
}
