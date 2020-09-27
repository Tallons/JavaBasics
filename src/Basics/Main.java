package Basics;

import Basics.Operators.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //arrays
//        int[] myIntegers = Array.getIntegers(5);
//        System.out.println(Arrays.toString(myIntegers));
//        System.out.println("Array Average: " + Array.getAverage(myIntegers));
//
//        int[] biggerArray = Array.resizeArray(myIntegers);
//        System.out.println(Arrays.toString(biggerArray));


        // High Score Positions
//        byte highScorePosition = BasicFunctions.calculateHighScorePosition(1500);
//        BasicFunctions.displayHighScorePosition("Tom", highScorePosition);
//
//        highScorePosition = BasicFunctions.calculateHighScorePosition(900);
//        BasicFunctions.displayHighScorePosition("Bob", highScorePosition);
//
//        highScorePosition = BasicFunctions.calculateHighScorePosition(400);
//        BasicFunctions.displayHighScorePosition("Bill", highScorePosition);
//
//        highScorePosition = BasicFunctions.calculateHighScorePosition(50);
//        BasicFunctions.displayHighScorePosition("Ed", highScorePosition);


        // Kilometers to Miles Converter
//        BasicFunctions.printConversion(10.25d);


        //Operators
        Arithmetic.arithmetic(25, 15);

        Bitwise.bitwise(38, 23);

        Conditional.conditional(2, "teacher");

        int[] array ={1,2,3,1,2,3};
        Equality.equality(array);

        Unary.unary(25);

        String[] careers = {"Nurse", "Engineer", "Teacher", "Contractor"};
        List<String> students = new ArrayList<>();
        students.add("Todd");
        students.add("Chad");
        students.add("Susan");
        students.add("Liz");
        Loops.loops(5, careers, students);

        Inputs.inputs();

    }


}
