package day05_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 55,
                weeklyHours = 45;
        double stateTaxRate = 7;     // implicit casting
        double federalTaxRate = 24.5;

    //--------------------------------------------------------

        //Hint: salaryBeforeTax = hourlyRate * weeklyHours * 52

        //double salaryBeforeTax = 55* 45 *52;  so is not practical if variables change for ex hourlyRate
        double salaryBeforeTax = weeklyHours * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate/ 100;
        double federalTax = salaryBeforeTax * federalTaxRate/ 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;



        System.out.println("Gross pay is $" + salaryBeforeTax);
        System.out.println("federal tax is $" + federalTax);
        System.out.println("state tax is $" + stateTax);
        System.out.println("total tax is $" + totalTax);
        System.out.println("Net income is $" + salaryAfterTax);

        System.out.println("---------------------------------------------");

        System.out.println("Gross pay is $" + salaryBeforeTax
                + "\nfederal tax is $" + federalTax
                + "\nstate tax is $" + stateTax
                + "\ntotal tax is $" + totalTax
                + "\nNet income is $" + salaryAfterTax);
    // hint: Code line wrapping - how to handle long lines : so you need nothing (like \ in python) as you see above
    }
}
/*
Warmup tasks:
	1. Create a class called SalaryCalculator.java
			1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: 79560
        */