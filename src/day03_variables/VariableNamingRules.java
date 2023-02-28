package day03_variables;

public class VariableNamingRules {
    public static void main(String[] args) {
        //1- readable,understandable, and meaningful
        // age of the student is 28
        //salary is 10000

        int x = 28;  // x, y, z can be given but not meaningfull to use to remember
        int age = 28; // more readable understandable meaningful

        //2- must be unique

        //int age = 28; // compile error because variable name must be unique

        //3- if multiword the variable name should be camelcase
        int phonenumber = 325146845;    // is not readable
        int phoneNumber = 215444565;
        double salaryBeforeTax = 10000.7;
        //4- variable name can not have space
        //5- variable name can not hava spacial caracter other than _ and $
        double salary_after_tax$ =  12;

        //6- variable names can not start with digits
        //int 22number = 200; // compile error because of begin with digit
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;
        //7-variable name can not be java reserved words
        // some of the words reserved in java like : class, float, case, public, return ...

        // double abstract = 5.5; // compile error

        // String as a data type---------------------------
        // gender is male for example:
        String gender = "male";
        String fullName = "Robert de Niro";

        String greeting;
        greeting = "Hi";










    }
}
