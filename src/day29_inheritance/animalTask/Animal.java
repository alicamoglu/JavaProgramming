package day29_inheritance.animalTask;

public class Animal {

    private String name;
    private String breed;
    private char gender;
    private int age;
    private String size;
    private String color;

    public static boolean isAnimal;

    static {
        isAnimal = true;
    }

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
       setName(name);
       setBreed(breed);
       setGender(gender);
       setAge(age);
       setSize(size);
       setColor(color);
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking water");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {      //an output with this:  Tiger{name='Sher Khan', breed='Bengal', gender=M, age=5, size='Large', color='Orange'}
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

/*    public String toString() {      //an output with this:  Animal{name='Sher Khan', breed='Bengal', gender=M, age=5, size='Large', color='Orange'}
        return "Animal{" +          // but we use it to get subclass object to print therefore getClass().getSimpleName() is used by return like above
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
  } */


}

/*
0. Animal
			attributes:
					name, breed, gender, size, color, age

			methods:
				setInfo(), eat(), sleep(), drink(), toString()
 */