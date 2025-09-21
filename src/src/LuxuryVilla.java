package src;

/**
 * Demonstrates Multiple Inheritance through interfaces.
 * LuxuryVilla inherits from ResidentialBuilding and implements two interfaces:
 * HasSwimmingPool and HasGarden.
 */
public class LuxuryVilla extends ResidentialBuilding implements HasSwimmingPool, HasGarden {

    LuxuryVilla(String location, double areaInSqFt, int numberOfBedrooms) {
        super(location, areaInSqFt, 2, numberOfBedrooms);
    }

    @Override
    public void showPoolDetails() {
        System.out.println("Feature: Includes a private, temperature-controlled swimming pool. 🏊");
    }

    @Override
    public void showGardenDetails() {
        System.out.println("Feature: Includes a beautifully landscaped private garden. 🌳");
    }

    void displayLuxuryVillaDetails() {
        System.out.println("--- Luxury Villa Details ---");
        super.displayResidentialDetails(); // Inherited method
        showPoolDetails(); // Implemented method from interface
        showGardenDetails(); // Implemented method from interface
    }
}
