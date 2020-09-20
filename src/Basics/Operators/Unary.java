package Basics.Operators;

public class Unary {

    public static void unary(int num){
        System.out.println("number: " + num);
        num = +1;
        System.out.println("number = +1: " + num);
        num = +5;
        System.out.println("number = +5: " + num);
        System.out.println("number-- : " + num--);
        System.out.println("number: " + num);
        System.out.println("--number : " + --num);
        System.out.println("number++ : " + num++);
        System.out.println("number: " + num);
        System.out.println("++number : " + ++num);
        System.out.println("number = -number : " + -num);

    }
}
