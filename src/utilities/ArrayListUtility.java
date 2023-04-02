package utilities;

import java.util.ArrayList;

public class ArrayListUtility {
    public static int sum(ArrayList<Integer> anArrayList) {
        int sum = 0;
        for (int i = 0; i < anArrayList.size(); i++) {
            sum += anArrayList.get(i);
        }
        return sum;
    }

    public static int frequencyOfCharacter(ArrayList<Integer> anArrayList, int anElement) {
        int count = 0;
        for (int i = 0; i < anArrayList.size(); i++) {
            if (anArrayList.get(i) == anElement) {
                count++;
            }
        }
        return count;
    }

}