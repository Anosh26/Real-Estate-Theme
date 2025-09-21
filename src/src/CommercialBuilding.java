package src;

/**
 * Part of Hierarchical Inheritance demonstration.
 * CommercialBuilding (Child 2) inherits from the SAME parent, Building.
 */
public class CommercialBuilding extends Building {
    String businessType;

    CommercialBuilding(String location, double areaInSqFt, int numberOfFloors, String businessType) {
        super(location, areaInSqFt, numberOfFloors);
        this.businessType = businessType;
    }

    void displayCommercialDetails() {
        System.out.println("--- Commercial Building Details ---");
        super.displayPropertyDetails();
        System.out.println("Permitted Business Type: " + this.businessType);
    }
}