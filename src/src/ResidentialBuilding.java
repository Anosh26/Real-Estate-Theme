package src;

/**
 * Part of Hierarchical Inheritance demonstration.
 * ResidentialBuilding (Child 1) inherits from Building (Parent).
 */
public class ResidentialBuilding extends Building {
    int numberOfBedrooms;

    ResidentialBuilding(String location, double areaInSqFt, int numberOfFloors, int numberOfBedrooms) {
        super(location, areaInSqFt, numberOfFloors);
        this.numberOfBedrooms = numberOfBedrooms;
    }

    void displayResidentialDetails() {
        System.out.println("--- Residential Building Details ---");
        super.displayPropertyDetails();
        System.out.println("Bedrooms per Unit: " + this.numberOfBedrooms);
    }
}