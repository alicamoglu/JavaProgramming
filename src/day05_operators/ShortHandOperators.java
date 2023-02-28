package day05_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        // ----------------------ASSIGNMENT OPERATOR------------------------
        int a = 20;
        System.out.println(a);  //20
        System.out.println(a);  //20
        // if you need 20 no longer as variable a
        //then it's possibel to update it
        a = 40;
        System.out.println(a);  // 40

        a = 90;
        System.out.println(a);
       // ----------------------ADDITION ASSIGNMENT OPERATOR------------------------
        double balanca = 100;

        balanca += 1000;       // balanca = 100 + 1000

        System.out.println("balanca = " + balanca);

        balanca += 500;         // balanca = 1100 + 500

        System.out.println("balanca = " + balanca);

        // ----------------------SUBTRACTİON ASSIGNMENT OPERATOR------------------------
        balanca -= 1000;  //
        System.out.println("balanca = " + balanca);
        balanca -= 500 ;
        System.out.println("balanca = " + balanca);
        System.out.println("//////////////////////////////////////////////////////////////////////////////");
// ----------------------SUBTRACTİON ASSIGNMENT OPERATOR------------------------
        double salary = 45000;
        salary *= 2;   // 45000*2
        System.out.println("salary = " + salary);   // 90000

        double eth = 4;
        eth *= 250;
        System.out.println("//////////////////////////////////////////////////////////////////////////////");
// ----------------------DİVİSİON ASSIGNMENT OPERATOR------------------------
        eth /= 2;
        System.out.println("eth = " + eth);  //500

        System.out.println("//////////////////////////////////////////////////////////////////////////////");
// ----------------------REMAINDER ASSIGNMENT OPERATOR------------------------
        int b = 39;
        b %= 7;
        System.out.println("b = " + b); //2



    }
}
