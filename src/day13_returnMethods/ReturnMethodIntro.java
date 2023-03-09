package day13_returnMethods;

public class ReturnMethodIntro {


    public static void main(String[] args) {

      // int total = sum(20, 40);  // sum is a void method, does not return any data

      int total =   addition(10, 20);

      int t = square(10);

        System.out.println(  square(10) );

        System.out.println( cube(5));

        int r = cube(5);


    }

/*
    public static void sum(int n1, int n2){    //todo with void method it's impossible to return any value ord data only print possible

        int result = n1 + n2;
        System.out.println(result);

    }
*/

    public static int addition(int n1, int n2){
        int result = n1 + n2;
        return result;
    }


    public static int square(int num){  // here short instead of int for example
        int square = num * num;
        return square;                   // then  return (short) square;
    }  // todo without return gives compileerror when other of void and return has 2 functionality 1 geves out a data and exit the method


    public static int cube(int num){
        int cube = square(num) * num;     // todo !! square
        return cube;
    }




}
