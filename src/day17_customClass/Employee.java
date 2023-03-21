package day17_customClass;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;                          // public static double salary;  if all employees have the same salary
    public String id;


    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
// return type is void since it return nothing just setting values if it int were return ... so must be ended the this method89
    } // sets all the attributes of the Employee object at once
// right click generate constructor choose ok delete class name write setInfo


    public String toString() { // to avoid getting hash code when we print employee object
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }


    public void work() {
        System.out.println(name + " is working");
    }

// these are instance mehtods therefore multicopy if static one copy. seperate copies will be shared for objects
}
