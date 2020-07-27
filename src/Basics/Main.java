package Basics;

public class Main {

    public static void main(String[] args) {

        // High Score Positions
        byte highScorePosition = BasicFunctions.calculateHighScorePosition(1500);
        BasicFunctions.displayHighScorePosition("Tom", highScorePosition);

        highScorePosition = BasicFunctions.calculateHighScorePosition(900);
        BasicFunctions.displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = BasicFunctions.calculateHighScorePosition(400);
        BasicFunctions.displayHighScorePosition("Bill", highScorePosition);

        highScorePosition = BasicFunctions.calculateHighScorePosition(50);
        BasicFunctions.displayHighScorePosition("Ed", highScorePosition);


        // Kilometers to Miles Converter
        BasicFunctions.printConversion(10.25d);

    }


}
