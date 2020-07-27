package Challenges.HamburgerCompany;

public class Main {

        public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Beef", 3.75, "Wheat");
        double price = hamburger.itemizedHamburger();
        hamburger.addHamburgerAdditionOne("Tomato", 0.35);
        hamburger.addHamburgerAdditionTwo("Lettuce", 0.25);
        System.out.println("Grand total: $ " + hamburger.itemizedHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizedHamburger();
        }
}
