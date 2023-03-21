package day15_whileLoop;

import java.util.Scanner;

public class FindingOutMaxWithForLoop {
    public static void main(String[] args) {
//        int maxNumb = 0;    // otherwise this temporary variable will commen to as answer instead of one of five inputed number
        int maxNumb = -2147483648;
        for (int i = 0; i < 5 ; i++) {
            int number = new Scanner(System.in).nextInt();
                if (maxNumb < number){
                    maxNumb = number;
                }
        }
        System.out.println("maxNumb = " + maxNumb);
    }
}
