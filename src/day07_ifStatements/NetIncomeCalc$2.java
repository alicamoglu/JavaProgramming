package day07_ifStatements;

public class NetIncomeCalc$2 {

    public static void main(String[] args) {
        // else if works as like the code snippet in the commend part  with && expression just right of it
        // and in multi branche if statements ( else if block )the statements are checked form top to bottom and the statements below of
        // the true one are not checked since the rule can be one true statement but in a multiple independent if blocks all the
        // if statements are checked regarding true or false.
        // when the if statement checks isMarried was "else if" then it would not be checked .
        long salary = 100000l;
        boolean isMarried = true;
        double taxRate = 0;


        if(salary >= 130000){ // if the salary is 130k or more, then the tax rate should be 35%
            taxRate = 0.35;
        }

        else if(salary >= 100000){ //if(salary >= 100000 && salary < 130000){ // if the salary is between 100k to 130k (excluded), then the tax rate should be 30%
            taxRate = 0.3;
        }

        else if(salary >= 80000){ //if(salary >= 80000 && salary < 100000){ // if the salary is between 80k to 100k (excluded), then the tax rate should be 25%
            taxRate = 0.25;
        }

        else {  // the same with if(salary < 80000) but not be checked anyway like if(salary < 80000){ // if the salary is  less than 80k, then the tax rate should be 20%
            taxRate= 0.2;
        }


        if(isMarried){  // if the person is married
            taxRate -= 0.05; //tax is reduced by 5%
        }


        double totalTax = salary * taxRate;
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);
        System.out.println("taxRate = " + taxRate);




    }


}

/*
3. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129,999k
                        25% for salary of 80K to 99,999K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax

 */