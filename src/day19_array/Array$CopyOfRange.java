package day19_array;

import java.util.Arrays;

public class Array$CopyOfRange {
    public static void main(String[] args) {
        int[] numbers = {2,6,4,58,32,25,14,56,24,85,15};
        System.out.println(numbers.length);    //11
        System.out.println("+".repeat(14)+1+"+".repeat(14));
        int[] result = Arrays.copyOf(numbers,4);
        System.out.println(Arrays.toString(result));    //[2, 6, 4, 58]


        System.out.println("+".repeat(14)+2+"+".repeat(14));
        int[] result2 = Arrays.copyOf(numbers,14);
        System.out.println(Arrays.toString(result2));  //[2, 6, 4, 58, 32, 25, 14, 56, 24, 85, 15, 0, 0, 0]


        System.out.println("+".repeat(14)+2+"+".repeat(14));


        int[] result3 = Arrays.copyOfRange(numbers,2,5);
        System.out.println(Arrays.toString(result3));        //[4, 58, 32]


        System.out.println("+".repeat(14)+3+"+".repeat(14));











    }
}
