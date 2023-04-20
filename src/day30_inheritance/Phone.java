package day30_inheritance;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Phone {

    private String brand,model,size,color;
    private double price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String [] colorArray = {"Black", "White", "Silver", "Gold", "Pink"};
//        if(!(color.equals("Black")|| color.equals("White")|| color.equals("Silver")|| color.equals("Gold")|| color.equals("Pink"))) {          //1th way
//        if(!(  ArraysUtility.contains(colorArray,color))) {                                                                                     //2th way
        if (!(Arrays.asList(colorArray).contains(color))){                                                                                          //3th way
            System.err.println("Invalid color: " + color + " only \"Black\", \"White\", \"Silver\", \"Gold\" and \"Pink\" will be valid.");
            System.exit(1);
        }
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Invalid entry: " + price + "please enter positive value only");
            System.exit(1);
        }
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public Phone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }
    public void call(long phoneNumber){
        System.out.println(getModel() + " is calling " + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(getModel() + " is is texting to "+ phoneNumber );
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

/*    public String toString() {                   // to see the difference
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }*/
}
/*
1. Create a named Phone:
				Variables:
					brand, model, size, price, color
				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}
				Add a constructor that can set all the fields
				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */
