package day20_forEach;

import java.util.Arrays;

public class Merge2Arrays {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4},
                arr2= {5,6};
        int[] arr3 = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
//        int k = arr3.length-1;              // look other file with this practical
        for (int i = arr2.length-1, k=arr3.length-1; i >= 0; i--,k--) {
            arr3[k] = arr2[i];
        }
        System.out.println("arr3 = " + Arrays.toString(arr3));






    }
}
