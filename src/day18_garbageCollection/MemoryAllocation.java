package day18_garbageCollection;

import day17_customClass.Employee;

class Car{

    public String brand;
    public String model;
    public String color;
    public int year;

}


public class MemoryAllocation {

    public static void main(String[] args) {

        int a = 100; // stack

        Car car   =  new Car();
        //  stack      heap


        System.out.println("-----------------------------------------");

        Employee employee1 = new Employee();
        Employee employee2 = employee1;            //these are only 1 object in the heap but they are 2 referance objects in the stack and they are referancing in the heap one

        employee1.setInfo("Rehane", 30, 'F', "Java Developer",95000, "A12");

        System.out.println(employee1);
        System.out.println(employee2);


        System.out.println("-----------------------------------------");

        String batch1 = new String("Java");
        String batch2 = batch1;
        String batch3 = batch1;
        String batch4 = new String("Java");
/*  in heap total 2 object as new String("Java") and the part "Java" string literal in String Pool and in stack 4 referance variable
3 of them first and last one the last one are refering
*/




    }


    public static void method1(){

        int b = 200; // stack

    }


    public static void method2(){

        String  c  =  "Hello World";
        //    stack       heap (String Pool)

        String  d   =  new String("Hello World") ;
        //     stack         heap    (this Hello World outside the string pool
    }



}
