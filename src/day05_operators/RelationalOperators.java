package day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 1000;
        int b = 200;
        System.out.println(a>b);  //true
        boolean aIsGreater = a > b;
        System.out.println(aIsGreater);   //true

        int score = 75;
        boolean passed = score >= 60;
        System.out.println(passed);
        System.out.println("-----------------------------------");
        boolean passed2 = score >= 75;
        System.out.println("passed2 = " + passed2);
        int age = 21;
        boolean eilgibleToBuyAlcohol = age >= 21;   //true

        boolean eligibleToVote = age >= 18;
        System.out.println(eligibleToVote);

        System.out.println(100>100);    //false
        System.out.println(100>= 100);   //true

        System.out.println(100>= 85);   //true
        score = 49;
        boolean failed = score < 60;
        System.out.println(failed);
        System.out.println("-------------------");
        System.out.println(100 < 200);   // true
        System.out.println(100 < 20);    // false
        System.out.println("-------------------");
        System.out.println(100 <= 100);   // true
        System.out.println("-------------------");
        System.out.println('a'< 'b');
        // they evaluate        65 < 66  true

        //System.out.println("Java" <= "C#"); // it gives error since they can only be applicable for numbers



    }
}
