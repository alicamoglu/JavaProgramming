//mesela satır 25 vb neden reassign  gerekmiyor ve sort() parantez içine yazılırken  size() parantez içi boş çalışır
package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility$Question {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8));

        int max = Collections.max(list);
        int min = Collections.min(list);  // array list is also in Collections but to use some methods Collections must be imported

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("---------------------------------------------------------------");

        ArrayList<String>  items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Potato",  "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper towels"));

        Collections.sort(items);

        System.out.println(items);

        System.out.println("---------------------------------------------------------------");

        Collections.reverse(items);
        System.out.println(items);

        System.out.println("---------------------------------------------------------------");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(  Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal" )   );

        System.out.println(students);

        Collections.swap(students, 0 , 1);

        System.out.println(students);

        Collections.swap(students, 0, students.size()-1);

        System.out.println(students);






    }

}
