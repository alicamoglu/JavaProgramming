package day05_operators;

public class LogicaalOperators {
    public static void main(String[] args) {
        //----------------------------------------->  && : both   <------------------------------------------
        double salary = 60000;
        int creditScore = 650;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650;
        System.out.println("eligibleForLoan = " + eligibleForLoan);
        System.out.println("------------------------------------------------------------------------------1");
        double salary2 = 60000;
        int creditScore2 = 500;

        boolean eligibleForLoan2 = salary2 >= 30000 && creditScore2 >= 650;
        System.out.println("eligibleForLoan2 = " + eligibleForLoan2);
        System.out.println("------------------------------------------------------------------------------2");

        double salary3 = 60000;
        int creditScore3 = 900;
        int age = 42;


        boolean eligibleForLoan3 = salary3 >= 30000 && creditScore3 >= 650 && age >= 18;
        System.out.println("eligibleForLoan3 = " + eligibleForLoan3);

        //----------------------------------------->   || : either     <------------------------------------------
        String answer = "maybe";

        boolean validAnswer = answer == "yes" || answer == "no";

        System.out.println(validAnswer);     // false

        String answer1 = "no";

        boolean validAnswer1 = answer1 == "yes" || answer1 == "no";

        System.out.println(validAnswer1);     // evolute true
        System.out.println("------------------------------------------------------------------------------3");

        char grade = 'B';

        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C'|| grade == 'D';
        /* in the line just above using && instead of || is absolute impossible since a variable can not
        be at the same time all A, B , C and D */
        System.out.println(passedTheExam);
        System.out.println("------------------------------------------------------------------------------4");
//----------------------------------------->   ! : opposite     <------------------------------------------
        System.out.println(!true);    // false

        String a = "yes";
        boolean yes = a == "yes";   // true
        boolean no = !yes;          // false

        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);

        System.out.println(true == !false && false == !true && true != !true);      // analize without run







    }

}
