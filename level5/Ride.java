import java.util.Scanner;

// Pricing class
class RidePricing {

    // Encapsulated constants
    private final double baseFare = 200;
    private final double costPerKm = 50;

    // Method to calculate fare
    public double calculateFare(double distance) {
        return baseFare + (distance * costPerKm);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter distance (km): ");
        double distance = input.nextDouble();

        // Create object
        RidePricing ride = new RidePricing();

        // Calculate fare
        double totalFare = ride.calculateFare(distance);

        // Output result
        System.out.println("Total Fare: " + totalFare + " KES");

        input.close();
    }
}