package day10_string;

import java.util.Scanner;
//import java.lang.String;     these both System and String are also class imported implecently
//import java.lang.System;

public class StringIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // new keyword and Scanner structer.:Scanner.(System.in)
//        String object for also is needed new keyword
        // String objects can be created by new keyword or by String literal
        String str = "Java";

        System.out.println();

        input.close();

        System.out.println("----------------------------1");

        // here are creating String objects by String Literal
        // by using double quotes and in the special memory called String pool
        // string literal is allocated in memory different from new key
        // all java objects in heap memory and have own memory and all object memories in the heap memory
        // also the string pool is inside the heap and in the string pool (vip section) only string literal
        // there wont be any duplected object
        String s3 = "Cat";         // therefore these are exactly the same and only one object in string pool
        String s4 = "Cat";

        String s1 = "Cat";
        String s2 = "Dog";
// although I have 4 String object created out there only 2 were allocated
        System.out.println(s1 == s3);     //true
        System.out.println(s1 == s4);     //true
        System.out.println(s3 == s4);     //true
        String s5 = new String("Cat");
        System.out.println(s1 == s5);       // false
// there is noch stack memory the place the local variables are allocated in it. for ex.: s1 ,s2,s3, s4 in stack memroy
        System.out.println("---and other way to creat an String  object--");

        String str1 = new String("Java"); // with these two are Created two objects: inside the heap but outside the string pool
        String str2 = new String("Java"); // then in the heap object can be duplicate
    // and for any object outside the pool but inside the heap a new memory created
        // however any of two above Creates two objects: 1. String pool (java literal since it is also literal part "java" included), 2 times new memory location (because of new keyword)in heap (outside string) opened up
// also 2 object in heap 1 object in pool they are not the same they are new but they are visable tex the same
        System.out.println( str1 == str2);    // false reason is just above line
//Texts are the same when they are printed but they aren't the same objects

        System.out.println("----------------------------2");

        String t1 = "Python";
        String t2 = new String("Python");
        String t3 = new String("Python");
// so far in the  string pool there are only one object with text :Python.
        // outside the pool there are 2
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);    // are the same in console
        System.out.println("----------------------------3");

        System.out.println(t1 == t2);  //false
        System.out.println(t3 == t2); // false




    }

}
