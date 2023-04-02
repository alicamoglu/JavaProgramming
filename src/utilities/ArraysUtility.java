package utilities;

import java.util.Arrays;

public class ArraysUtility {
    
    public static int[] merge(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0 ; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }


    public static double[] merge(double[] arr1, double[] arr2){

        double[] arr3 = new double[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0 ; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }
    
    
    public static char[] merge(char[] arr1, char[] arr2){

        char[] arr3 = new char[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0 ; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }


    public static String[] merge(String[] arr1, String[] arr2){

        String[] arr3 = new String[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0 ; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        return arr3;
    }



    public static int[] reverse(int[] array){

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= array[i];
        }

        return reverse;
    }


    public static double[] reverse(double[] array){

        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= array[i];
        }

        return reverse;
    }


    public static char[] reverse(char[] array){

        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= array[i];
        }

        return reverse;
    }



    public static String[] reverse(String[] array){

        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= array[i];
        }

        return reverse;
    }



    public static int[] addElement(int[] array, int element){
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length-1] = element;
        return new_array;
    }


    public static double[] addElement(double[] array, double element){
        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length-1] = element;
        return new_array;
    }


    public static char[] addElement(char[] array, char element){
        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length-1] = element;
        return new_array;
    }


    public static String[] addElement(String[] array, String element){
        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length-1] = element;
        return new_array;
    }



                                  //{1,2,3,4},   1
    public static boolean contains(int[] array, int element){

        for (int each : array) {
            if(each == element){
                return true;
            }
        }

        return false;
    }


    public static boolean contains(double[] array, double element){

        for (double each : array) {
            if(each == element){
                return true;
            }
        }

        return false;
    }



    public static boolean contains(char[] array, char element){

        for (char each : array) {
            if(each == element){
                return true;
            }
        }

        return false;
    }



    public static boolean contains(String[] array, String element){

        for (String each : array) {
            if(each.equals( element )){
                return true;
            }
        }

        return false;
    }

    public static String arrayToString(String[] aArray) {
        String resultStr = "";
        for (String s : aArray) {
            if (s.equals("")){
                continue;
            }else {
                resultStr += s + " ";
            }
        }
        return resultStr;
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

    public static char[] stringArrayToChar(String[] str) {         // this method returns only first char of each strings of array
        char[] str1 = new char[str.length];
        for (int iii = 0; iii < str.length; iii++) {
            str1[iii] = str[iii].charAt(0);
        }
        return str1;
    }

    public static int[][] merge2Ds(int[][] arr2Da,int[][] arr2Db) {
        int[][] arr2Dc = new int[arr2Da.length+ arr2Db.length][];
        int k = 0;
        for (int i = 0 ; i < arr2Da.length; i++,k++) {
            arr2Dc[k] = arr2Da[i];
        }
        for (int i = 0; i < arr2Db.length; i++,k++) {
            arr2Dc[k] = arr2Db [i];
        }
        return arr2Dc;
    }
    public static String[][] merge2Ds(String[][] arr2Da,String[][] arr2Db) {
        String[][] arr2Dc = new String[arr2Da.length+ arr2Db.length][];
        int k = 0;
        for (int i = 0 ; i < arr2Da.length; i++,k++) {
            arr2Dc[k] = arr2Da[i];
        }
        for (int i = 0; i < arr2Db.length; i++,k++) {
            arr2Dc[k] = arr2Db [i];
        }
        return arr2Dc;
    }
    public static double[][] merge2Ds(double[][] arr2Da,double[][] arr2Db) {
        double[][] arr2Dc = new double[arr2Da.length+ arr2Db.length][];
        int k = 0;
        for (int i = 0 ; i < arr2Da.length; i++,k++) {
            arr2Dc[k] = arr2Da[i];
        }
        for (int i = 0; i < arr2Db.length; i++,k++) {
            arr2Dc[k] = arr2Db [i];
        }
        return arr2Dc;
    }




    /*

    // array = { 10, 20, 30, 40} , 2  ===> {10, 20, 40}


    public static int[] remove(int[] array, int index){

    }



    public static int[] removeDup(int[] array){

    }

*/


}
