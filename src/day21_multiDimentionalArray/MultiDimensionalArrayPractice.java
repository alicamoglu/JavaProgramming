package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"Lucy", "Umran", "Sumeye", "Abidullah"}; //4names;
        String[] group2 = {"Madiyar", "Khashayar", "Rayhane"}; //3 names;
        String[] group3 = {"Alena", "Evgeniya", "Shukur", "Hasan", "Bilal"}; //5 names;
        String[] group4 = {"Adelina", "Ali"}; //2 names;


        String[][] groups = {group1, group2, group3, group4};
        //                      0        1       2       3
        System.out.println(Arrays.deepToString(groups));

        System.out.println("self practice ↓");
        for (String[] group : groups) {
            for (String s : group) {
                System.out.println(s);
            }
        }
        System.out.println("---------------------------1---------------------");
        for (int group = 0; group < groups.length; group++) {
            for (int i = 0; i < groups[group].length; i++) {
                System.out.println(groups[group][i]);
            }

        }
        System.out.println("self parctice ↑");

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }

        }


        System.out.println("-----------------------------------------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup) );
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }


        System.out.println("-----------------------------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {

            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }

        }


        System.out.println("-----------------------------------------------------------");

        System.out.println(groups);

        System.out.println( Arrays.toString(groups)); // toString() ==> for single dimensional arrays ONLY

        System.out.println( Arrays.deepToString(groups) ); // deepToString() ==> for multi-dimensional dimensional arrays ONLY




    }


}
