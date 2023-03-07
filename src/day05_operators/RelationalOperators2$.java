package day05_operators;

public class RelationalOperators2$ {
    public static void main(String[] args) {
    // ==:
        System.out.println(1000 == 2000);   // false
        System.out.println("Java" == "Java");  // true
        System.out.println("Java" == "JAVA");  // false
        System.out.println("Muhtar" == "Good guy");  //false
        System.out.println("-----------------------1-----------------------");
        System.out.println("Java".toUpperCase() == "JAVA");  // ?
        System.out.println("//////////////////////////2//////////////////////////////");
        System.out.println("Java".toUpperCase().equals("JAVA"));
        System.out.println("/////////////////////////3///////////////////////////////");
        System.out.println("Java".equalsIgnoreCase("JAVA"));
        System.out.println("/////////////////////////4///////////////////////////////");

        // != :
        System.out.println(1000 != 2000);   // true
        System.out.println("Java" != "Java");  // false
        System.out.println("Java" != "JAVA");  // true
        System.out.println("Muhtar" != "Good guy");  //true
        System.out.println("Java".toUpperCase() != "JAVA");  // !?
        System.out.println(true != false); //true


    }
}
