public class Main {

    // Method to check access permissions
    static String checkAccess(String role) {
        if (!role.equals("Doctor")) {
            throw new RuntimeException(
                "Access denied: Only doctors can access patient records."
            );
        }
        return "Access granted to patient records.";
    }

    // Scope experiment method
    public static void patientRecord() {
        String patientName = "John Doe";
        System.out.println("Inside function: " + patientName);
    }

    // Entry point of Java program
    public static void main(String[] args) {

        // Access Control
        try {
            System.out.println(checkAccess("Nurse"));
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println(checkAccess("Doctor"));
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Scope Experiment
        patientRecord();
    }
}