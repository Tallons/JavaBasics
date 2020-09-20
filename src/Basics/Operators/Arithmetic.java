package Basics.Operators;

public class Arithmetic {

    public static void arithmetic(int num1, int num2) {
        System.out.println("Numbers: " + num1 + ", " + num2);
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
        System.out.println(num1 + " Squared: " + Math.pow(num1, 2));
    }
}
