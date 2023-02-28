package day04_concatination;

public class PrimitiveTypeCastings {
    // non-primitive are also object types like String   TODO !!!!
    public static void main(String[] args) {
        // ---------Implicit Casting------------------
        byte a = 15;
        short b = a;                // its value automatically casted to the short  (converted)
        // short b = (short)a;
        System.out.println("b = " + b);

        int c = a;                  // this is also a primitiv casting

        long d = 3000L;            // float is larger than long
        float f = d;               //therefore implicit casting
        // implicit casting is done automatically you don't worry about it
        // because they have been casting a smaller primitive type to a larger primitive type
        //------------------------------Explicit Casting-----------------------------------------------------
        //On the contrary(the exact opposite) from a larger primitive type to smaller to casting you should
        //converted to be explicitly
        int aa = 110;
        //byte bb = aa;             //it gives error
        //byte bb = (short)aa;      //a larger primitive type to a smaller primitive type directly given is wrong
        byte bb = (byte) aa;        // we need the casting operator (byte) to be casted. not to have a error
        float z = 20.8F;
        //short q = z;               // the casting operator is missing
        short q = (short) z;
        System.out.println("q = " + q);      // z = 20.8 but q != 20.8 but q = 20 so it cuts decimal part

        double n1 = 2.5;
        byte n2 = (byte) n1;       // alt + enter gives options if you have compile error.
        // !! here just above row n2 = 2 after casting to a integer primitive tpye
        int num = 500;
        byte result = (byte) num;    // explicit casting
        System.out.println("result = " + result);   //result what printed is -12
        // since byte can not have 500 and it calculates to convert a number in range byte

        System.out.println("----------------------------------------------5");
        int r = 50000;
        short t = (short) r;
        System.out.println("t = " + t);

        long l = 50; //Todo 50 is whole number and 50's datatype is default int
        long l2 = 3_000_000; // todo 3000000 is a whole number and  its datatype also is default int
//        therefore long is  a datatype of l and l2
        long l3 = 3_000_000_000L;// all number's default datatype is int and it is being struggled as int by compiler
// therefore the L in just above line allows the compiler to read the number as a long  instead of int
    // TODO using the L and F with a number told the compiler to read it as a long or float


    }
}
