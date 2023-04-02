package day21_multiDimentionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;
import java.util.Scanner;

public class checkIfAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        input.nextLine();
        String str2 = input.next();
//        char[] char1 =  str1.toCharArray();  // with this code direct to 30. line
//        char[] char1 = str1.split("");
        String[] arr11 = str1.split("");
        String[] arr12 = str2.split("");
        System.out.println(Arrays.toString(arr11));
        System.out.println(Arrays.toString(arr12));
        char[] arr111 = new char[arr11.length];
        char[] arr112 = new char[arr12.length];

        for (int i = 0; i < arr11.length; i++) {
            arr111[i] = str1.charAt(i);
        }
//        for (int ii = 0; ii < arr12.length; ii++) {
//            arr112[ii] = str1.charAt(ii);
//        }
        for (int iii = 0; iii < arr12.length; iii++) {
            arr112[iii] = arr12[iii].charAt(0);
        }
        Arrays.sort(arr111);
        Arrays.sort(arr112);
        System.out.println(Arrays.toString(arr111));
        System.out.println(Arrays.toString(arr112));
//        if (arr111.equals(arr112)) {
//            System.out.println("They are anagram");
//        }else {
//            System.out.println("They are not anagram");
//        }
        System.out.println(isArraysEqual(arr111,arr112));
//        System.out.println(ArraysUtility.isArraysEqual(arr111,arr112));
        System.out.println(Arrays.equals(arr111,arr112));     // this is instead of a manual method.
    }

    public static String isArraysEqual(char[] aa , char[] bb) {
        int count = 0;
        for (int i = 0; i < aa.length; i++) {
            if (aa[i] == bb[i]) {
                count++;
            }
        }
        if (aa.length != bb.length) {
            return "They are not anagram";
        } else {
            if (count != aa.length){
                return "They are not anagram";
            }else {
                return "They are anagram";
            }
        }


    }
}