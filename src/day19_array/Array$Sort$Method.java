package day19_array;

import java.util.Arrays;

public class Array$Sort$Method {
    public static void main(String[] args) {
        int[] numbers = {2, 6, 4, 58, 32, 25, 14, 56, 24, 85, 15};

//        int[] numbers2 = Arrays.sort(numbers);

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        String[]  myGroup = new String[5];
        myGroup[0] = "Gulcin";
        myGroup[myGroup.length-1] = "Aseel";
        myGroup[2] ="Sumeye";
        myGroup[1] = "Abidullah";
        myGroup[3] = "Khashayar";
        System.out.println("myGroup = " + Arrays.toString(myGroup));


        Arrays.sort(myGroup);
        System.out.println("myGroup = " + Arrays.toString(myGroup));
    }
}
