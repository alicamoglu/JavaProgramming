package day24_dateAndTime;
/*
1. Given the following arraylist of Employees:
			ArrayList<Employee> employees = new ArrayList<>();
	        employees.addAll(Arrays.asList(
	               new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
	        ));

	        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
	        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
	        employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
	        employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
	        employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

	        Note: Employee class is imported from day17 package

	        1.1 Write a program that can display the name and job title of each employee

	        1.2 Write a program that can display the names of "Java Developers"

	        1.3 Write a program that can display the maximum and minimum salary

	        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
	         can add all the female employees and male employees to the femaleEmployees and maleEmployees arraylists
 */
import day17_customClass.Employee;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        //           1.1
        for(Employee each : employees){
            System.out.println(each.name + " : " + each.jobTitle);
        }
        //           1.2
        for (Employee each : employees){
            if(each.jobTitle.equals("Java Developer")){   // todo
                System.out.println(each.name);
            }
        }
        //           1.3  max and min salary
        // array list hat max and min methods but if its elements element were would it work,
        double max = employees.get(0).salary;
        double min = employees.get(0).salary;
        
        for (Employee employee : employees) {
            if(employee.salary> max){
                max=employee.salary;
            }
            if(employee.salary<min){
                min= employee.salary;
            }
        }
        //           1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
        //	         can add all the female employees and male employees to the femaleEmployees and maleEmployees arraylists


        ArrayList<Employee> femaleEmployees = new ArrayList<>();
        ArrayList<Employee> maleEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.gender == 'M'){             // if the amployee is male
                maleEmployees.add(employee);        // is been added
            }
            if(employee.gender == 'F'){
                femaleEmployees.add(employee);
            }
        }

        System.out.println("maleEmployees = " + maleEmployees);
        System.out.println("femaleEmployees = " + femaleEmployees);
        System.out.println("total number of maleEmployees = " + maleEmployees.size());
        System.out.println("total number of femaleEmployees = " + femaleEmployees.size());

    }

}
