package day11_string;

public class StringMethods1$ {

    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";  // string object is immutable what makes then this toLowerCase method ??
        str1.toLowerCase();  // if not reassigned str1 absolute not changed but only a change on the place written implemented.
        System.out.println(str1); //CYDEO SCHOOL
        str1 = str1.toLowerCase(); //"cydeo school"  all the characters has been converted to lower case.
                                    // therefore str1 is not chanced but reassigned to a new String str1
        System.out.println(str1);


        System.out.println("------------------1-----------------------");

        String str2 = "java programming";

        String str3 = str2.toUpperCase(); //"JAVA PROGRAMMING"

        System.out.println(str2);

        System.out.println("------------------2-----------------------");

        String word = "Wooden Spoon";

        word = word.toUpperCase(); //"WOODEN SPOON"

        word = word.toLowerCase(); //"wooden spoon"

        System.out.println(word);

        System.out.println("------------------3-----------------------");

        String str4 = "          Cydeo School";

        str4 =  str4.trim(); //"Cydeo SchooL"           //removes all spaces

        System.out.println(str4);


        System.out.println("------------------4-----------------------");

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index1 = sentence1.indexOf('w');    //21

        System.out.println(index1);

        System.out.println("------------------5-----------------------");

        String s1 = "I Love Java Programming";

        int firstA = s1.indexOf('a');   //8

        System.out.println(firstA);
        System.out.println("------------------6-----------------------");

        int secondA = s1.indexOf("a ");   // to reach second character of a I have added what character comes after a
//                if I would reach third a then I added what after a right there "am"

        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');

        System.out.println(a1);

        int a2 = s2.indexOf("a Python"); //or
        int aa = s2.indexOf("va")+1;

        System.out.println(a2);
        System.out.println(aa);

        int a3 = s2.indexOf("avaS");  // it has been made more unique

        System.out.println(a3);

        int a4 = s2.indexOf("aS");

        System.out.println(a4);

        System.out.println("------------------7-----------------------");


        String w = "Java";

        System.out.println(w.indexOf('a')); //1

        System.out.println(w.lastIndexOf('a')); //3
        System.out.println(w.lastIndexOf("av"));  //1
        System.out.println(w.lastIndexOf("ava"));  //1
        System.out.println(w.lastIndexOf("Java"));  //0
        System.out.println(w.lastIndexOf("Jav"));   //0

        System.out.println("------------------8-----------------------");

        String w2 = "Java Python JavaScript Cydeo Python";


        System.out.println(w2.lastIndexOf('a'));

        System.out.println(w2.lastIndexOf('P'));





    }

}
