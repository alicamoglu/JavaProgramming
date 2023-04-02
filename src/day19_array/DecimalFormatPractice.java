package day19_array;

import java.text.DecimalFormat;

public class DecimalFormatPractice {


    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.0000");

        double n1 = 10.587654;

        System.out.println(  df.format(n1)  );
        System.out.println(decimalReturn(22.31245));


    }

    public static String decimalReturn(double aNumber) {
        DecimalFormat df = new DecimalFormat("0.0");
        return df.format(aNumber);
    }

}
