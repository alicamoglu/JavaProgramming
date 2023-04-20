package day29_inheritance.encapsulation;

public class TestStudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Hamza", 26, 'M', 'A', "MIT");

        System.out.println(student1);

        student1.setSchoolName("Harvard");
        student1.setGrade('B');

        System.out.println(student1);

        Student student2 = new Student();  // I have added a default Constructor (without parameter)

        System.out.println(student2.getName());
        student2.setSchoolName("school");
        System.out.println(student2.getSchoolName());
    }


}
