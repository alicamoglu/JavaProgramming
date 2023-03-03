package day10_string;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
public class ReadFilesWithScanner {
    public static void main(String[] args)throws IOException{// throw I0Exception { when Scanner error has click over chently and comes a red balb at the beginnning of the line. and first solve gives that.

        //Scanner scan = new Scanner(System.in);so System in is for keyboard entry
        // but this time file will be read by java
        //Scanner scan = new Scanner(Path.of(first: "C:\\java\\JavaProgramming\\src\\day10_string\\Test.txt")); // ctrl + space brigs all chosen in brackets after Scanner or ctrl + click Scanner
        Scanner scan = new Scanner( Path.of("src/day10_string/Test.txt")); //instead of path path from content root in intellij
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());  // any of these nextLine print one line from file

//        next() reads word by word but nextLine() reads line by  line
//        when empty file has been read can not read and error

        System.out.println(scan.hasNext()); // true if not empty file
        scan.close();



    }
}
