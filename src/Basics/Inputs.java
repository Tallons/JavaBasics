package Basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inputs {

    public static void inputs() {

        textInput();

        try {
            fileInput();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void textInput() {
        System.out.println("Enter your name");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Nice to meet you " + name);
        input.close();
    }

    private static void fileInput() throws FileNotFoundException {

        Scanner in = new Scanner(new File("src/Resources/student_names.txt"));

        List<String> students = new ArrayList<>();

        while (in.hasNextLine()) {
            students.add(in.nextLine());
        }

        String names = String.join(", ", students);
        System.out.println("Students Names: " + names);
        // see Loops > loopForLists for more

        in.close();

    }
}
