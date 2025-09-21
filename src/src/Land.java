package src;

/**
 * Demonstrates Single Inheritance.
 * Land (Child) inherits from one parent class, Property (Parent).
 */
public class Land extends Property {
    boolean isAgricultural;

    Land(String location, double areaInSqFt, boolean isAgricultural) {
        super(location, areaInSqFt);
        this.isAgricultural = isAgricultural;
    }

    void displayLandDetails() {
        System.out.println("--- Land Details ---");
        super.displayPropertyDetails();
        System.out.println("Is Agricultural: " + (isAgricultural ? "Yes" : "No"));
    }
}