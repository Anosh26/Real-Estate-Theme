package src;

/**
 * A general base class representing any piece of real estate property.
 */
public class Property {
    String location;
    double areaInSqFt;

    Property(String location, double areaInSqFt) {
        this.location = location;
        this.areaInSqFt = areaInSqFt;
    }

    void displayPropertyDetails() {
        System.out.println("Location: " + this.location);
        System.out.println("Area (sq. ft.): " + this.areaInSqFt);
    }
}