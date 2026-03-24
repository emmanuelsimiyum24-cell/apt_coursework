import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "EMMANUEL";
        String correctPassword = "Manu254";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Invalid Credentials");
        }

        System.out.println("\n--- Logical Error Demo ---");

        if (username == correctUsername && password == correctPassword) {
            System.out.println("Access Granted (WRONG LOGIC)");
        } else {
            System.out.println("Invalid Credentials");
        }

        scanner.close();
    }
}