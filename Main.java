import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("1. Addition (+)");
        System.out.println("2. Multiplication (*) ");
        System.out.println("3. Subtraction (-) ");
        System.out.println("4. Division (/) ");
        System.out.println("Choose an operator: ");
        char operation = input.next().charAt(0);

        if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
            System.out.println("Valid");

        } else {
                System.out.println("Invalid");
                System.exit(operation);
            }


        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        if (operation == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (operation == '/') {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Invalid, try again!");
        }

    }

}
