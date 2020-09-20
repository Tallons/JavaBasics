package Basics;

public class Loops {

    public static void loops(int num, String[] array) {

        basicForLoop(num);
        arrayLoop(array);
        basicWhileLoop(num);
        basicDoWhileLoop(num);

    }

    private static void basicForLoop(int num) {
        System.out.println("count to " + num);
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }

    private static void arrayLoop (String[] array) {
        System.out.println("Possible Career Paths");
        for (String career : array) {
            System.out.println(career);
        }
    }

    private static void basicWhileLoop(int num) {

        int i = 0;
        while (i < num) {
            System.out.println("number is " + i);
            System.out.println("number is too low, increasing number");
            i++;
        }
        System.out.println("your number is " + i);
    }

    private static void basicDoWhileLoop(int num) {

        int i = 1000;
        do {
            num = (int) Math.pow(num, 2);
            System.out.println("Your new number is " + num);
        } while (num < i);
    }
}
