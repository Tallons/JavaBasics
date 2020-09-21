package Basics.Operators;

public class Bitwise {

    public static void bitwise(int num1, int num2) {
        System.out.println("AND: " + (num1 & num2));
        System.out.println("OR: " + (num1 | num2));
        System.out.println("XOR: " + (num1 ^ num2));
        System.out.println("NOT " + num1 + ": " + ~num1);
        System.out.println("NOT " + num2 + ": " + ~num2);
        System.out.println("LEFT SHIFT " + num1 + ": " + (num1<<1));
        // each left shift is multiplying number by 2
        System.out.println("RIGHT SHIFT " + num1 + ": " + (num1>>1));
        // each right shift is dividing number by 2 (rounds down)
        System.out.println("LOGICAL SHIFT " + num1 + ": " + (num1>>>1));
        // each logical shift is dividing number by 2 (rounds down)
        // negatives are treated differently with logical shift
    }
}
