package day04_concatination;

public class ConcatenationIntro {
    public static void main(String[] args) {
        String name = "Alexander";
        int age = 35;
        int salary = 85_000;              // 85_000 = 85000 but 85,000 gives an error
        System.out.println("Hello " + name);
        System.out.println("Hello " + name + ".");
        System.out.println("You are " + age + "years old.");
        System.out.println("Your salary is " + salary + " USD");

        int number = 100_000_000;
        System.out.println("number = " + number);

        int num1 = 20;
        float num2 = 20.5f;

        System.out.println(num1 + num2);  // here is not a concatenation but an addition operator

    }
}
