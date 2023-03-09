package day12_customMethods;

public class ifEligibleMethod {
    public static void main(String[] args) {
    eligibleToVoid(32);
    }

    public static void eligibleToVoid(int age) {
        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

    }
}
