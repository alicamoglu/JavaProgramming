package day12_customMethods;

public class CustomMethodIntro {
// todo every single method must be inside the class body and outside the body of other methods main method as well .
    public static void main(String[] args) {
// any method can be initialized in main method but can be called anywhere
        greetings();
        displayMessage();

    }
    public static void greetings (){

        System.out.println("Hello world");
        System.out.println("How are you");

    }

    public static void displayMessage() {
        System.out.println("hallo world");
        System.out.println("I love Java");
    }
}
