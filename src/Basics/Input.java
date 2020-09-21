package Basics;

import java.util.Scanner;

public class Input {

    public static void input() {
        System.out.println("Enter your name");

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("Nice to meet you " + name);
        in.close();
    }
}
