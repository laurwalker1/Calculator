import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculatorObject = new Calculator();
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

        double number1 = chooseFirstNumber();
        double number2 = chooseSecondNumber();

        switch (operation) {
            case '+':
                calculatorObject.add(number1, number2);
                break;

            case '-':
                calculatorObject.sub(number1, number2);
                break;

            case '*':
                calculatorObject.mul(number1, number2);
                break;

            case '/':
                calculatorObject.div(number1, number2);
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

}

