import java.util.Scanner;

// Patient Class
class Patient {

    // Encapsulated fields
    private String name;
    private String policyNumber;

    // Constructor
    public Patient(String name, String policyNumber) {
        this.name = name;
        this.policyNumber = policyNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    // Method to calculate claim
    public double calculateClaim(double amount) {
        double copayment = amount * 0.10;
        return amount - copayment;
    }
}

// Main Class
public class Main {

    // Procedural function
    public static double calculateClaim(double amount) {
        double copayment = amount * 0.10;
        return amount - copayment;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Input
        System.out.print("Enter patient name: ");
        String name = input.nextLine();

        System.out.print("Enter policy number: ");
        String policy = input.nextLine();

        System.out.print("Enter claim amount: ");
        double amount = input.nextDouble();

        // OOP Approach
        Patient patient = new Patient(name, policy);
        double oopResult = patient.calculateClaim(amount);

        // Procedural Approach
        double proceduralResult = calculateClaim(amount);

        // Output
        System.out.println("\n NHIF CLAIM SUMMARY");
        System.out.println("Patient: " + patient.getName());
        System.out.println("Policy No: " + patient.getPolicyNumber());
        System.out.println("Approved Claim: " + oopResult);

        System.out.println("\n NHIF CLAIM SUMMARY");
        System.out.println("Patient: " + name);
        System.out.println("Policy No: " + policy);
        System.out.println("Approved Claim: " + proceduralResult);

        input.close();
    }
}