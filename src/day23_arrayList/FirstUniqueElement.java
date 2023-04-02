package day23_arrayList;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {
//        ArrayList = {20,45,7,45,14,4,14,85,20,41};// ?
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(10);
        aList.add(20);
        aList.add(30);
        aList.add(10);
        aList.add(40);
        aList.add(50);
        aList.add(60);
        aList.add(10);
        aList.add(20);
        aList.add(40);
        aList.add(60);
        int firstUnique= aList.get(0);
//        for (int i = 0; i < aList.size(); i++) {
//            }
        System.out.println(frequencyOfCharacter(aList,aList.get(0)));
        for (int i = 0; i < aList.size(); i++) {
            if(frequencyOfCharacter(aList,aList.get(i))==1){
                System.out.println(aList.get(i)+ " is the first unique character");
                break;         // otherwise it gives last unique character
            }
        }

        }



    public static int frequencyOfCharacter(ArrayList<Integer> anArrayList,int anElement) {
        int count = 0;
        for (int i = 0; i < anArrayList.size(); i++) {
            if (anArrayList.get(i)==anElement){
                count++;
            }
        }
        return count;
    }
}
