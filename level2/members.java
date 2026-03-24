import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String memberName, memberID;
        double contribution, totalSavings = 0;

        System.out.print("Enter Member Name: ");
        memberName = scanner.nextLine();

        System.out.print("Enter Member ID: ");
        memberID = scanner.nextLine();

        System.out.println("Enter monthly contributions for 6 months:");

        for (int i = 0; i < 6; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            contribution = scanner.nextDouble();
            totalSavings += contribution;
        }

        System.out.println("\n--- Member Record ---");
        System.out.println("Name: " + memberName);
        System.out.println("ID: " + memberID);
        System.out.println("Total Savings: " + totalSavings);

        System.out.println("\n--- Type Test (Assigning String) ---");


        System.out.println("Cannot assign string to double (compile-time error in Java)");

        scanner.close();
    }
}