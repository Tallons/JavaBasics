package Basics;

public class BasicFunctions {

    public static void displayHighScorePosition(String playerName, byte highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition +
                " on the high score table");
    }

    public static byte calculateHighScorePosition(int playerScore) {
        byte position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }

    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1L;
        }
        return Math.round(kilometerPerHour/1.60934d);
    }
    public static void printConversion (double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
