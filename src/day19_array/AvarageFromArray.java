package day19_array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AvarageFromArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter how many numbers you want to enter: ");
        int[] arrayList = new int[scan.nextInt()];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = scan.nextInt();
        }
        System.out.println(average(arrayList));
    }

    public static String average(int[] list){
        int sum = 0;
//        for (int i = 0; i < list.length; i++) {
//            sum +=list[i];           // instead of these 2 lines below 2 lines are recommended.
        for (int j : list) {
            sum += j;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        float average1 = sum/(float)list.length; // without casting gives warning
        return df.format(average1);  // actually float but decimal format returns a String
    }
}
