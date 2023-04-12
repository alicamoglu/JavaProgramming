package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Adam", 'M', LocalDate.of(1985, 9, 25));
        people[2].setInfo("Aron", 'M', LocalDate.of(1957, 7, 25));
        people[3].setInfo("Katherine", 'F', LocalDate.of(1966, 1, 25));
        people[4].setInfo("Jakob", 'M', LocalDate.of(1985, 9, 25));

//        people[1].name= "Adam";
//        people[1].gender='M';
//        people[1].age = 12;
//        people[1].dateOfBirth = LocalDate.of(1985,5,5);

        System.out.println(people[0]);
        System.out.println(people[1]);
        System.out.println("//////////////////   1   /////////////////");
        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll( Arrays.asList(people) );

        System.out.println(studentsList);
        System.out.println("\\\\\\\\\\\\\\\\\\\\  2  \\\\\\\\\\\\\\\\\\\\");
        // print name & date of birth of each person object
//        System.out.println(studentsList.get(1));
        for (Person person : studentsList) {
            System.out.println(person.name + " : " + person.dateOfBirth );
        }

        // remove all the person object that has the age > 55
        for (Person person : studentsList) {
            if(person.age>55){
                System.out.println(person.name + " : " + person.age);
            }
        }
        System.out.println("---------------after rempoveIf older than 55    --------------");
        studentsList.removeIf(p ->p.age>55);
        for (Person person : studentsList) {
            System.out.println(person.name + " : " + person.age );
        }


    }

}
