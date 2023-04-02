package day23_arrayList;

import java.util.ArrayList;

public class AvarageOfNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(10);
        aList.add(20);
        aList.add(30);
        aList.add(40);
        aList.add(50);
        aList.add(60);
        System.out.println(sum(aList));
        System.out.println(sum2(aList));
        double avarage = sum(aList)/aList.size();
        System.out.println(avarage);
    }

    public static int sum(ArrayList<Integer> a) {
        int sum = 0;
        for (Integer integer : a) {
            sum += integer;
        }
    return sum;
    }

    public static int sum2(ArrayList<Integer> a) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
        }
        return sum;
    }
}
