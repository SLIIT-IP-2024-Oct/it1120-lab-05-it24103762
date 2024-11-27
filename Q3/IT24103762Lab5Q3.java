import java.util.Scanner;

public class IT24103762Lab5Q3 {  // Replace IT24103762 with your own student ID.
    // Declare constants
    static final int ROOM_CHARGE_PER_DAY = 48000;
    static final int MIN_DAYS_FOR_DISCOUNT = 3;
    static final int MAX_DAYS_IN_MONTH = 31;

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for the start and end date of the reservation
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        // Validation 1: Check if the start and end dates are between 1 and 31
        if (startDate < 1 || startDate > MAX_DAYS_IN_MONTH || endDate < 1 || endDate > MAX_DAYS_IN_MONTH) {
            System.out.println("Error: Start and end dates must be between 1 and 31.");
            return;  // Exit the program
        }

        // Validation 2: Check if the start date is less than the end date
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be earlier than the end date.");
            return;  // Exit the program
        }

        // Calculate the number of days reserved
        int daysReserved = endDate - startDate + 1;

        // Calculate the discount rate based on the number of days reserved
        double discountRate = 0;
        if (daysReserved >= MIN_DAYS_FOR_DISCOUNT && daysReserved <= 4) {
            discountRate = 10;  // 10% discount
        } else if (daysReserved >= 5) {
            discountRate = 20;  // 20% discount
        }

        // Calculate the total room charge
        double totalAmount = ROOM_CHARGE_PER_DAY * daysReserved;

        // Apply the discount if applicable
        double discountAmount = (discountRate / 100) * totalAmount;
        totalAmount -= discountAmount;

        // Output the results
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.println("Total amount to be paid: Rs " + totalAmount);

        // Close the scanner
        scanner.close();
    }
}
