import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the subtotal and gratuity rate
        System.out.print("Enter the subtotal and a gratuity rate: ");

        // Read the subtotal and gratuity rate from the user
        double subtotal = scanner.nextDouble();
        double gratuityRate = scanner.nextDouble();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Calculate gratuity and total
        double gratuity = (gratuityRate / 100) * subtotal;
        double total = subtotal + gratuity;

        // Display the result
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
