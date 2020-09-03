import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        // Create scanner object
        Scanner Input = new Scanner(System.in);

        // Output the prompt
        System.out.println("Enter your name: ");

        // Wait for the user to enter something.
        String valueText = Input.nextLine();

        // Tell them what they entered.
        System.out.println("Welcome " + valueText);

        // Output the prompt
        System.out.println("Enter a integer value: ");

        // Wait for the user to enter something.
        double valueInt = Input.nextInt();

        // Tell them what they entered.
        System.out.println("You entered: " + valueInt);

        // Output the prompt
        System.out.println("Enter a floating point value: ");

        // Wait for the user to enter something.
        double valueDouble = Input.nextDouble();

        // Tell them what they entered.
        System.out.println("You entered: " + valueDouble);

    }
}
