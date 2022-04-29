import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isOperatorValid = false;
        char operation =0;
        double num1, num2;

        Scanner input = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("1. Addition (+)");
        System.out.println("2. Multiplication (*) ");
        System.out.println("3. Subtraction (-) ");
        System.out.println("4. Division (/) ");


        while (!isOperatorValid) {
            System.out.println("Choose an operator: ");
            operation = input.next().charAt(0);


           if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
                isOperatorValid =true;
           }
       }
//            if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
//                isOperatorValid = true;
//            }
//        }

        System.out.println("Enter the first number: ");
        num1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        num2 = input.nextDouble();

//            if (operation == '+') {
//                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//            } else if (operation == '-') {
//                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//            } else if (operation == '*') {
//                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//            } else if (operation == '/') {
//                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//            } else {
//                System.out.println("Invalid, try again!");
//            }
//
//        }
        switch (operation) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;

            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;

            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;

            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;

        }

            input.close();

    }
}