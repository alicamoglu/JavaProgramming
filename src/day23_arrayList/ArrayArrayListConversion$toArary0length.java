package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion$toArary0length {

    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};

        ArrayList<String> list = new ArrayList<>( Arrays.asList(arr) );

        System.out.println(list);


        System.out.println("------------------------1------------------------------");


        ArrayList<String> list2 = new ArrayList<>( Arrays.asList("Java", "Python", "C#") );

        String[] languages = list2.toArray(new String[0]);     // if [10] comes many null and since it new no problem less length then arraylist
//        String[] languages = list2.toArray(new String[list2.size()]);  // this can be also

        System.out.println(Arrays.toString(languages));

        System.out.println("-------------------------2-----------------------------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

       Integer[] n = nums.toArray(new Integer[0]);
     //   int[] n = nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(n));



    }

}
