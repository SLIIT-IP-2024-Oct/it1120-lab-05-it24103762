import java.util.Scanner;

public class IT24103762Lab5Q2 {  // Replace IT24103762 with your own student ID.
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the number of new members they have introduced
        System.out.print("Enter the number of new members introduced: ");
        
        // Read the input as an integer
        int newMembers = scanner.nextInt();

        // Validate the input to ensure it's greater than or equal to 0
        if (newMembers < 0) {
            System.out.println("Invalid input. The number of new members must be greater than or equal to 0.");
        } else {
            // Use a switch statement to determine the prize based on the number of new members
            String prize;
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }
            // Output the prize
            System.out.println("The prize for introducing " + newMembers + " new member(s) is: " + prize);
        }

        // Close the scanner
        scanner.close();
    }
}
