import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hardcoded credentials
        String correctUsername = "adminKE";
        String correctPassword = "254Secure";

        // User input
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Validation
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Invalid Credentials");
        }

        scanner.close();
    }
}