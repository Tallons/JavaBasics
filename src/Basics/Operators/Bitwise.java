package Basics.Operators;

public class Bitwise {

    public static void bitwise(int num1, int num2) {
        System.out.println("AND: " + (num1 & num2));
        System.out.println("OR: " + (num1 | num2));
        System.out.println("XOR: " + (num1 ^ num2));
        System.out.println("NOT " + num1 + ": " + ~num1);
        System.out.println("NOT " + num2 + ": " + ~num2);
    }
}
