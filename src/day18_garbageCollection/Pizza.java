package day18_garbageCollection;

public class Pizza {          // so is instance if it were static all pizza will be the same
                            // no need main method because this class to create object
    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public String toString() {                // toString modified
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price of pizza=" + calcCost() +                                 // I have this added.
                '}';               // what you want to be printed
    }

    public double calcCost(){
        double cost = 0;
        switch (size){
            case 'S':
            case 's':               // .toUpperCase() is tried but it has given anywhere
                cost = 10;
                break;
            case'M':
            case'm':
                cost = 12;
                break;
            case'L':
            case'l':
                cost = 14;
                break;
            default:
                System.err.println("Invalid size: " + size);
        }
        return cost + 2 * numberOfCheeseTopping + 2 * numberOfPepperoniTopping;
    }
}
