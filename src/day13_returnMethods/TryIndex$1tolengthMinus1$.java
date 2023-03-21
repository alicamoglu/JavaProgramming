package day13_returnMethods;

public class TryIndex$1tolengthMinus1$ {
    public static void main(String[] args) {
        String word = "everyone";
        String word3 = word.substring(0,word.length());  // whole string is result but index length is not shown (can not be show too)
        String word4 = word.substring(0,1);  // like here index 1 not be shown but index 0 is shown !
        String word2 = word.substring(0,word.length()-1); // last character is removed
        String word1 = word.substring(1,word.length()-1);
        System.out.println("----------1--------------");
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length()-1));

        System.out.println("-----------2-------------");

        System.out.println(word);
        System.out.println(word3);
        System.out.println(word4);
        System.out.println(word2);
        System.out.println(word1);

        System.out.println(word.length());
        System.out.println(word.lastIndexOf("e"));

    }
}
