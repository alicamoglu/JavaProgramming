package day25_Constructor;
import day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

/*
1. Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from package day17

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

	            Note: DO NOT use any loops

	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

	            Note: DO NOT use any loops

	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

	            Note: DO NOT use any loops
 */
public class RemoveIfMethodWarmUpTask {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

//        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList
        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));
        System.out.println(smallDogs);
        System.out.println("--------------------------------1-------------------------------");
        smallDogs.removeIf(p->!p.size.equals("Small"));
        System.out.println(smallDogs);
        System.out.println("--------------------------------2-------------------------------");

//        1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList


//        1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList


//        1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList


    }
}
