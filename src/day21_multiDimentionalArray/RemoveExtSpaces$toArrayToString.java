package day21_multiDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveExtSpaces$toArrayToString {
    public static void main(String[] args) {
        System.out.println("enter a string to remove spaces: ");
        String str = new Scanner(System.in).nextLine();
        String [] toArray = str.split(" ");
        System.out.println(Arrays.toString(toArray));
        String toString = "",
                toString2 = "",   // only this successful   (erfolgreich) (not failed nicht gescheiter)
                toString3 = "";
        for (int i = 0; i < toArray.length; i++) {
            if (toArray[i].equals(" ")){
                continue;
            } else{
                toString += toArray[i] + " ";
            }
        }
        System.out.println(toString);
        for (String s : toArray) {
            if (s.equals("")){
                continue;
            }else {
                toString2 += s + " ";
            }
        }

        System.err.println(toString2);
        for (String s : toArray) {
            toString3 += s;
        }
        System.out.println(toString3);
    }
}
