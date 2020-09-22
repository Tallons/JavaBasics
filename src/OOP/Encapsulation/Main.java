package OOP.Encapsulation;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Jacob";
//        player.health = 20;
//        player.weapon = "Axe";
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health: " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("remaining health: " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Jacob", 50, "Axe");

        int damage = 20;
        player.loseHealth(damage);
        System.out.println("remaining health: " + player.healthRemaining());

        damage = 31;
        player.loseHealth(damage);
        System.out.println("remaining health: " + player.healthRemaining());
    }
}
