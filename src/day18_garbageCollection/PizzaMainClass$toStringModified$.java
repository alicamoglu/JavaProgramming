package day18_garbageCollection;

public class PizzaMainClass$toStringModified$ {
    public static void main(String[] args) {
        Pizza order1 =new Pizza();
        order1.setInfo('M',3,5);

        System.out.println("order1 costet: " + order1.calcCost());

        double total20s = 0;
        for (int i = 0; i < 20; i++) {
            Pizza small20 = new Pizza();
            small20.setInfo('S',2,2);
            total20s += small20.calcCost();

            Pizza medium20 = new Pizza();
            medium20.setInfo('M',2,2);
            total20s += medium20.calcCost();

            Pizza large20 = new Pizza();
            large20.setInfo('S',2,2);
            total20s += large20.calcCost();


        }
        System.out.println("total of 20s: "+total20s);
    }
}
