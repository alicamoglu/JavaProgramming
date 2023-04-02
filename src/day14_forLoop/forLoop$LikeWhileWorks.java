package day14_forLoop;
import java.util.Scanner;
public class forLoop$LikeWhileWorks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        for (int day = 0; inhabitants >0  ; day++) {

            System.out.println("Day " + day + " [" + inhabitants + "]");
            inhabitants /= 2 ;

        }

        System.out.println("---- EXTINCT ----");
    }
}
