package src;

/**
 * Demonstrates Hybrid Inheritance (mix of Hierarchical and Multiple).
 * OfficeSpace extends CommercialBuilding and implements the IsLeasable interface.
 */
public class OfficeSpace extends CommercialBuilding implements IsLeasable {
    int numberOfCubicles;

    OfficeSpace(String location, double areaInSqFt, int numberOfFloors, int numberOfCubicles) {
        super(location, areaInSqFt, numberOfFloors, "Corporate Office");
        this.numberOfCubicles = numberOfCubicles;
    }

    @Override
    public void calculateLease() {
        double leaseAmount = super.areaInSqFt * 150; // Assuming Rs. 150 per sq. ft. monthly
        System.out.printf("Estimated Monthly Lease: ₹ %,.2f%n", leaseAmount);
    }

    void displayOfficeSpaceDetails() {
        System.out.println("--- Office Space Details ---");
        super.displayCommercialDetails();
        System.out.println("Number of Cubicles: " + this.numberOfCubicles);
        calculateLease(); // Call the implemented interface method
    }
}