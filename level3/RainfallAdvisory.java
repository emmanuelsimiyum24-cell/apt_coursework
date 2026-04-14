import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Loop for continuous monitoring
        while (true) {

            System.out.print("\nEnter rainfall amount (mm): ");
            double rainfall = input.nextDouble();

            System.out.print("Enter temperature (°C): ");
            double temperature = input.nextDouble();

            // Basic If-Else
            System.out.println("\n If-Else Result ");
            if (rainfall < 200) {
                System.out.println("Irrigation Required");
            } else if (rainfall >= 200 && temperature > 30) {
                System.out.println("Monitor Soil");
            } else {
                System.out.println("Normal Conditions");
            }

            // Nested If
            System.out.println("\n Nested If Result");
            if (rainfall < 200) {
                System.out.println("Irrigation Required");
            } else {
                if (temperature > 30) {
                    System.out.println("Monitor Soil");
                } else {
                    System.out.println("Normal Conditions");
                }
            }

            // Switch
            System.out.println("\n Switch Result");

            int category;

            if (rainfall < 200) {
                category = 1;
            } else if (temperature > 30) {
                category = 2;
            } else {
                category = 3;
            }

            switch (category) {
                case 1:
                    System.out.println("Irrigation Required");
                    break;
                case 2:
                    System.out.println("Monitor Soil");
                    break;
                case 3:
                    System.out.println("Normal Conditions");
                    break;
                default:
                    System.out.println("Invalid category");
            }

            // Repeat Option
            System.out.print("\nDo you want to check again? (yes/no): ");
            String choice = input.next();

            if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("Program ended.");
                break;
            }
        }

        input.close();
    }
}