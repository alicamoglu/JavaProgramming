package utilities;

public class StringUtility {




    public static String reverse(String str) {
        String reverse = "";   // to contain all the characters of the given in reverse method;

        for (int i = str.length()-1; i >=0 ; i--) {   // i : index number of the given string starting from last index to index 0
            reverse += str.charAt(i);              // in any iteration concats all characters

        }
        return reverse;
    }
}
