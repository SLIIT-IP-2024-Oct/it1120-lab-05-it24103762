import java.util.Scanner;

public class IT24103762Lab5Q1 {  // Replace IT24103762 with your own student ID.
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for three different integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Determine the smallest and largest of the three integers
        int smallest = num1;
        int largest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Output the smallest and largest numbers
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

        // Close the scanner
        scanner.close();
    }
}
