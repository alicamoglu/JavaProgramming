package day21_multiDimentionalArray;

import java.util.Arrays;

public class TryIteratingMultiDimensionalArray {
    public static void main(String[] args) {               // more powerful (reversed or from 3 start
        int[][] arr2D = {{10,20,30},{40,50,60,70,80},{90,100}};
        for (int[] arr1D : arr2D) {
            System.out.println(Arrays.toString(arr1D));
            for (int each : arr1D) {
                System.out.println(each);
            }

        }

        for (int arr1D = 0; arr1D < arr2D.length; arr1D++) {          // more easier
            for (int each = 0; each < arr2D[arr1D].length; each++) {
                System.out.println(arr2D[arr1D][each]);
            }
        }
    }

}
