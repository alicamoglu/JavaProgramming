package day16_nestedLoop;
import utilities.CountUtility;
import java.util.Scanner;

public class TestForCountUtility {
    public static void main(String[] args) {
        System.out.println("enter please string :");
        String str2 = new Scanner(System.in).nextLine(),
                strForPrint = "";

        for (int i = 0; i < str2.length(); i++) {
            if (strForPrint.contains(""+ str2.charAt(i))){
                continue;
            }
            strForPrint +="" + str2.charAt(i) + CountUtility.count(str2,str2.charAt(i));

        }
        System.out.println(strForPrint);
    }
}
