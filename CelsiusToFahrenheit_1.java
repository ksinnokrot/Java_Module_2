import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a degree in Celsius
        System.out.print("Enter a degree in Celsius: ");

        // Read the Celsius value from the user
        double celsius = scanner.nextDouble();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (9.0 / 5) * celsius + 32;

        // Display the result
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
