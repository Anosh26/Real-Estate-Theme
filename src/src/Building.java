/**
 * 
 */
package src;

/**
 * A class representing a structure built on a property.
 * This class inherits from Property.
 */
public class Building extends Property {
    int numberOfFloors;

    Building(String location, double areaInSqFt, int numberOfFloors) {
        super(location, areaInSqFt); // Call parent class constructor
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    void displayPropertyDetails() {
        super.displayPropertyDetails(); // Call parent class method
        System.out.println("Number of Floors: " + this.numberOfFloors);
    }
}