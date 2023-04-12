package day27_statics;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;


    public static String schoolName;// this variable can be initialized in way to continue = "Cyedeo"; but in the future not all the variable possible like that therefore static block is being used.
    public static String secretCode;

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
      //  schoolName = "Cydeo School";          because this block here execute multiple time
     //   secretCode = "Wooden Spoon";
    }

    static{
        schoolName = "Cydeo School";
        secretCode = "Wooden Spoon";
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }



}
