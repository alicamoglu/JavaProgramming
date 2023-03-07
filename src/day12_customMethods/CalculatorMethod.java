package day12_customMethods;

public class CalculatorMethod {
    public static void main(String[] args) {
        calculatorMethod(23,14,'+');
    }

    public static void calculatorMethod(double num1,double num2,char operator) {


        double result = 0;
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
