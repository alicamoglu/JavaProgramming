package day30_inheritance;

public class Iphone extends Phone{

//    public Iphone(String brand, String model, String size, String color, double price) {
//        super(brand, model, size, color, price);
    public Iphone(String model, String size, String color, double price) {  //here you
        super("Apple", model, size, color, price);
        this.hasApplePay = hasApplePay;
    }

    private boolean hasApplePay = true;
    public void faceTime(long phoneNumber){
        System.out.println();
    }


}
/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
*/