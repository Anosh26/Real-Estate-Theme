package src;

import java.util.Scanner;

/**
 * Main driver class with a menu to demonstrate all types of inheritance.
 * This class serves as the entry point for the application, allowing the user
 * to select and view a demonstration of a specific inheritance type.
 */
public class RealEstateDemo {

    /**
     * The main method which runs the menu-driven program.
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);
        // Variable to store the user's menu choice.
        int choice;

        // Use a do-while loop to repeatedly display the menu until the user chooses to exit.
        do {
            // Print the main menu header and options to the console.
            System.out.println("\n========= 🏡 REAL ESTATE INHERITANCE DEMO 🏗️ =========");
            System.out.println("1. Single Inheritance (Property -> Land)");
            System.out.println("2. Multilevel Inheritance (Property -> Building -> Apartment)");
            System.out.println("3. Hierarchical Inheritance (Building -> Residential / Commercial)");
            System.out.println("4. Multiple Inheritance (LuxuryVilla implements HasPool, HasGarden)");
            System.out.println("5. Hybrid Inheritance (OfficeSpace extends CommercialBuilding, implements IsLeasable)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            // Read the integer input from the user.
            choice = scanner.nextInt();

            // Use a switch statement to execute the code corresponding to the user's choice.
            switch (choice) {
                case 1:
                    // This case demonstrates Single Inheritance.
                    System.out.println("\n--- DEMONSTRATING SINGLE INHERITANCE ---");
                    // Create an instance of Land, which inherits directly from Property.
                    Land plot = new Land("Assagao, Goa", 5000, false);
                    plot.displayLandDetails();
                    break;
                case 2:
                    // This case demonstrates Multilevel Inheritance.
                    System.out.println("\n--- DEMONSTRATING MULTILEVEL INHERITANCE ---");
                    // Create an instance of Apartment, which inherits from Building, which in turn inherits from Property.
                    Apartment flat = new Apartment("Mumbai, Maharashtra", 1200, 15, 704, "Mr. Kenkre");
                    flat.displayApartmentDetails();
                    break;
                case 3:
                    // This case demonstrates Hierarchical Inheritance.
                    System.out.println("\n--- DEMONSTRATING HIERARCHICAL INHERITANCE ---");
                    // Create instances of two different classes (ResidentialBuilding and CommercialBuilding)
                    // that both inherit from the same parent class (Building).
                    ResidentialBuilding house = new ResidentialBuilding("Bengaluru, Karnataka", 2400, 2, 4);
                    house.displayResidentialDetails();
                    System.out.println(); // Add a blank line for better readability.
                    CommercialBuilding shop = new CommercialBuilding("Delhi", 3000, 1, "Retail Store");
                    shop.displayCommercialDetails();
                    break;
                case 4:
                    // This case demonstrates Multiple Inheritance (simulated with interfaces).
                    System.out.println("\n--- DEMONSTRATING MULTIPLE INHERITANCE (via Interfaces) ---");
                    // Create an instance of LuxuryVilla, which extends a class and implements multiple interfaces.
                    LuxuryVilla myVilla = new LuxuryVilla("Goa", 6000, 5);
                    myVilla.displayLuxuryVillaDetails();
                    break;
                case 5:
                    // This case demonstrates Hybrid Inheritance.
                    System.out.println("\n--- DEMONSTRATING HYBRID INHERITANCE ---");
                    // Create an instance of OfficeSpace, showing a combination of different inheritance types.
                    OfficeSpace myOffice = new OfficeSpace("Hyderabad, Telangana", 10000, 5, 150);
                    myOffice.displayOfficeSpaceDetails();
                    break;
                case 0:
                    // This case handles the program exit.
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    // The default case catches any integer inputs that are not valid menu options.
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            // Print a separator line after each action for clarity.
            System.out.println("======================================================");
        } while (choice != 0); // The loop continues as long as the user's choice is not 0.

        // Close the scanner to prevent resource leaks. This is a best practice.
        scanner.close();
    }
}