import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isOperatorValid = false;
        char operation = 0;
        Scanner scanObj = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.println("1. Addition (+)");
        System.out.println("2. Multiplication (*) ");
        System.out.println("3. Subtraction (-) ");
        System.out.println("4. Division (/) ");


        while (!isOperatorValid) {
            System.out.println("Choose an operator: ");
            operation = scanObj.next().charAt(0);

            if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
                isOperatorValid = true;
            }
        }

        double num1 = chooseFirstNumber();
        double num2 = chooseSecondNumber();

        switch (operation) {
            case '+':
                System.out.println("The answer is: " + add(num1, num2));
                break;

            case '-':
                System.out.println("The answer is: " + sub(num1, num2));
                break;

            case '*':
                System.out.println("The answer is: " + mul(num1, num2));
                break;

            case '/':
                System.out.println("The answer is: " + div(num1, num2));
                break;

        }
        scanObj.close();


    }

    public static double chooseFirstNumber() {
        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        return scanObj.nextDouble();

    }
    public static double chooseSecondNumber() {
        Scanner scanObj = new Scanner(System.in);

        System.out.println("Enter the second number: ");
        return scanObj.nextDouble();

    }


    public static double add(double num1, double num2) {
        double n;
        n = num1 + num2;
        return n;
    }
    public static double sub(double num1, double num2) {
        double n;
        n = num1 - num2;
        return n;
    }
    public static double mul(double num1, double num2) {
        double n;
        n = num1 * num2;
        return n;
    }
    public static double div(double num1, double num2) {
        double n;
        n = num1 / num2;
        return n;
    }


}

