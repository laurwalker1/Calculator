public class Calculator {
//    public static double add(double num1, double num2) {
//        double n;
//        n = num1 + num2;
//        return n;
//    }
//    public static double sub(double num1, double num2) {
//        double n;
//        n = num1 - num2;
//        return n;
//    }
//    public static double mul(double num1, double num2) {
//        double n;
//        n = num1 * num2;
//        return n;
//    }
//    public static double div(double num1, double num2) {
//        double n;
//        n = num1 / num2;
//        return n;
//    }
//    double num1, num2;
    public void add(double num1, double num2) {
        double n;
        n = num1 + num2;
        System.out.println("The answer is: "+ n);
    }
    public void sub(double num1, double num2) {
        double n = num1 - num2;
        System.out.println("The answer is: "+ n);
    }
    public void mul(double num1, double num2) {
        System.out.println("The answer is: "+ num1 * num2);
    }
    public void div(double num1, double num2) {
        double n= num1 / num2;
        System.out.println("The answer is: "+ n);
    }

}
