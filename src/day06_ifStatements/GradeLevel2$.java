package day06_ifStatements;

public class GradeLevel2$ {

    public static void main(String[] args) {

        int gradeLevel = 16;

        String result= "" ; //TODO    with only one print statement instead of many
        // temporary value and without it result gives error because of the print statement at the bottom

        if(gradeLevel >= 1 && gradeLevel <= 5){
           result = "Elemntary School";
        }

        if(gradeLevel >= 6 && gradeLevel <= 8){
           result = "Middle School";
        }

        if(gradeLevel >= 9 && gradeLevel <= 12){
           result = "High School";
        }

        if(gradeLevel >= 13 && gradeLevel <= 16){
           result = "College";
        }

        if(gradeLevel >= 17 && gradeLevel <= 18){
           result = "Grad School";
        }

        System.out.println("result = " + result);




















//      TODO       intellij goes (TODO'note) automatically quickly and easyly and  shows the map in console by click

    }


}
