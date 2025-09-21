package src;

/**
 * Demonstrates Multilevel Inheritance.
 * Apartment (Child) -> Building (Parent) -> Property (Grandparent).
 */
public class Apartment extends Building {
    int apartmentNumber;
    String ownerName;

    Apartment(String location, double areaInSqFt, int numberOfFloors, int apartmentNumber, String ownerName) {
        super(location, areaInSqFt, numberOfFloors);
        this.apartmentNumber = apartmentNumber;
        this.ownerName = ownerName;
    }

    void displayApartmentDetails() {
        System.out.println("--- Apartment Details ---");
        super.displayPropertyDetails(); // Calls Building's method
        System.out.println("Apartment Number: " + this.apartmentNumber);
        System.out.println("Owner: " + this.ownerName);
    }
}