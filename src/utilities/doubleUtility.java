package utilities;

import java.text.DecimalFormat;

public class doubleUtility {

//    public static void main(String[] args) {                   // this main method was used for test
//        String a = "0";
//        System.out.println(a.repeat(3));
//        System.out.println(decimalReturn(Math.PI,3));
//    }
    public static String decimalShortening(double aFloat, int repeatNumber) {
        String afterPoint = "0".repeat(repeatNumber);
        DecimalFormat df = new DecimalFormat("0."+afterPoint);
        return df.format(aFloat);
    }
}
