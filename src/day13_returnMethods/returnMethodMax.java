package day13_returnMethods;

public class returnMethodMax {
    public static void main(String[] args) {
        System.out.println(giveMax(5,8.3));
    }
    public static double giveMax(double num1,double num2){
        double result3 = 0;
        if (num1<num2) {
            result3 = num2;  //return num2
        } else if (num2<num1) {
            result3= num1;   //retur num1
        }
        return result3;     //oben2 return exist therefore you dont need that
    }
}
