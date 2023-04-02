package day21_multiDimentionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MaxUndMinFromMultidimArray {
    public static void main(String[] args) {
        int[][] arr2D1 = {{10,25,48},{15,87,22},{47,85,25}};
        int[][] arr2D2 = {{44,52},{33,99,1,12},{45,21,95}};
//        int[][] arr2D3 = ArraysUtility.merge(arr2D1,arr2D2);
        int[][] arr2D3 = ArraysUtility.merge2Ds(arr2D1,arr2D2);
        System.out.println(Arrays.deepToString(arr2D3));
        int max = arr2D3[0][0];
        for (int[] ints : arr2D3) {
            System.out.println(Arrays.toString(ints));
            for (int anInt : ints) {
                if (anInt > max){
                    max = anInt;
                }
            }
        }
        System.out.println(max);
    }
}
