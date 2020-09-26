package Basics;

import java.util.List;

public class Loops {

    public static void loops(int num, String[] array, List<String> list) {

        basicForLoop(num);
        loopForArrays(array);
        loopForLists(list); // this is a collection - see CoreAPI > Utilities > CollectionType
        basicWhileLoop(num);
        basicDoWhileLoop(num);

    }

    private static void basicForLoop(int num) {
        System.out.println("count to " + num);
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }

    private static void loopForArrays (String[] array) {
        //this is called an enhanced for loop
        System.out.println("Possible Career Paths");
        for (String career : array) {
            System.out.println(career);
        }
    }

    private static void loopForLists(List<String> list){

        for(int i = 0; i < list.size(); i++) {
            System.out.println("name: " + list.get(i));
        }
//        You can also use the enhanced for loop

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
