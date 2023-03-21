package day17_customClass;

public class TestDogObjects {

    public static void main(String[] args) {

         Dog dog1 = new Dog();

         dog1.name = "Max";
         dog1.breed = "Husky";
         dog1.gender = 'M';
         dog1.age = 4;
         dog1.size = "Large";
         dog1.color = "Gray";

         Dog dog2 = new Dog();

         dog2.name = "Bella";
         dog2.breed = "Golden Retriever";
         dog2.gender = 'F';
         dog2.age = 2;
         dog2.size = "Small";
         dog2.color = "Orange";


         Dog dog3 = new Dog();
         dog3.setInfo("Loki", "Chow chow", 'M', 3, "Medium", "Black");
// this setInfo() method also must be initialized in Dog Class
         Dog dog4 = new Dog();
         dog4.setInfo("Chuck", "Bulldog", 'M', 5, "Small", "White");


         Dog dog5 = new Dog();

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);  // if the toString exists but an objects attributes not be assigned like that: dog2.name = "Bella"; or with method setInfo() like that :dog4.setInfo("Chuck",...) then comes null in console

        dog3.eat();

        dog2.drink();





    }

}
