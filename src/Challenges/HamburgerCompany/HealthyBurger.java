package Challenges.HamburgerCompany;

public class HealthyBurger extends Hamburger {

    private String healthyExtraOneName;
    private double healthyExtraOnePrice;

    private String healthyExtraTwoName;
    private double healthyExtraTwoPrice;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyAdditionOne(String name, double price) {
        this.healthyExtraOneName = name;
        this.healthyExtraOnePrice = price;
    }

    public void addHealthyAdditionTwo(String name, double price) {
        this.healthyExtraTwoName = name;
        this.healthyExtraTwoPrice = price;
    }

    @Override
    public double itemizedHamburger() {
        double hamburgerPrice = super.itemizedHamburger();
        if(this.healthyExtraOneName != null) {
            hamburgerPrice += healthyExtraOnePrice;
            System.out.println("Added " + this.healthyExtraOneName + " for " + this.healthyExtraOnePrice);
        }
        if(this.healthyExtraTwoName != null) {
            hamburgerPrice += healthyExtraTwoPrice;
            System.out.println("Added " + this.healthyExtraTwoName + " for " + this.healthyExtraTwoPrice);
        }
        return hamburgerPrice;
    }
}
