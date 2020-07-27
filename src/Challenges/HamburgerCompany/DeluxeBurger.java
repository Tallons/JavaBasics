package Challenges.HamburgerCompany;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Beef & Bacon", 7.50, "Wheat");
        super.addHamburgerAdditionOne("Chips", 2.75);
        super.addHamburgerAdditionTwo("Drink", 1.75);
    }

    @Override
    public void addHamburgerAdditionOne(String name, double price) {
        System.out.println("Unable to add addition items to the deluxe burger");
    }

    @Override
    public void addHamburgerAdditionTwo(String name, double price) {
        System.out.println("Unable to add addition items to the deluxe burger");
    }

    @Override
    public void addHamburgerAdditionThree(String name, double price) {
        System.out.println("Unable to add addition items to the deluxe burger");
    }

    @Override
    public void addHamburgerAdditionFour(String name, double price) {
        System.out.println("Unable to add addition items to the deluxe burger");
    }
}
