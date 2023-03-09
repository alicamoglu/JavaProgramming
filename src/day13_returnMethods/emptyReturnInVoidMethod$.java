package day13_returnMethods;

public class emptyReturnInVoidMethod$ {
    //ReturnStament in java_Programing project Cydeo


    public static void main(String[] args) {


        eligible(25);
        System.out.println("------------------------------------");

        System.out.println("Test1 Started");

        boolean exit = true;
        if(exit){
            return; // todo main method gets terminated and nothing initializes below
        //    System.out.println("Hello");
        }

        System.out.println("Test1 Completed");

        System.out.println("Test2 started");

    }


    public static void eligible(int age){

        if(age < 0 || age > 150){
            System.err.println("Invalid age: "+age);
            return; // todo exits the method gives never any certen data or value out other method or pacages
            // todo if the age is invalid, then this method gets terminated
        }


        if(age>= 21){     // they are independent if statements this and just above
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol");
        }

    }



    public static int multiplication(int n1, int n2){

        int result = n1 * n2;

        return result; // returns the value when exiting the method
     //   System.out.println("Hello");

    }




}
