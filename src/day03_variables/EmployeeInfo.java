package day03_variables;



public class EmployeeInfo {
    public static void main(String[] args) {

        /*
        System.out.println("Aaron");
        System.out.println("Aaron");
        System.out.println("Aaron");
        System.out.println("---------------------------------------------------");
        String name = "Aaron";
        System.out.println(name);
        System.out.println(name);       // you should not remember what the name was to use later in code

         */

    String employeeName = "Jeck Richerd";
    int age = 38;
    char gender = 'M';
    String companyName = "Google Inc",
            employeeId = "A10",                   // ; ends but , does not end
            jobTitle = "Java Developer";          // that is not to write again data type String

    int salary = 100000;
    boolean isFullTime = true;





        System.out.println(employeeName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(companyName);
        System.out.println(employeeId);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(isFullTime);

        System.out.println("employeeName = " + employeeName);
        System.out.println("age = " + age);                          // soutv + Enter print variable
        System.out.println("gender = " + gender);
        System.out.println("salary = " + salary);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("employeeId = " + employeeId);



    }
}


/*
1. Create a class named EmployeeInfo.java
2. Declare the following variables with appropriate data types:
        1. name
        2. age
        3. gender
        4. companyName
        5. employeeId
        6. jobTitle
        7. salary
        8. isFullTime

*/