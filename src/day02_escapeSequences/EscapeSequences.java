package day02_escapeSequences;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Hallo students \n Today we have Java class");
        System.out.println("Hallo students \nToday we have Java class");       //  \n new line
        System.out.println("\tHallo students \n Today we have Java class");
        System.out.println("\t\tHallo students \n Today we have Java class");    //  \t paragraph space
        System.out.println("\\");                                                 // \\ appand back slash
        System.out.println("\"");
        System.out.println("my favorite tv series is \"Wolking Dead\"");          //  \" double quote
    }
}
