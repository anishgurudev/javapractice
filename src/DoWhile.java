import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Create scanner object
        Scanner Input = new Scanner(System.in);
        String day = null;
        do {
            // Output the prompt
            System.out.println("Enter the day");
            // Wait for the user to enter something.
            day = Input.nextLine();
            System.out.println("you entered " + day);
        } while (!day.equals("today"));
        System.out.println("correct!");
/*
        // Create scanner object
        Scanner Input = new Scanner(System.in);
        int value= 0;
        do {
            // Output the prompt
            System.out.println("Enter the no(0 0-5 )guess");
            // Wait for the user to enter something.
            value = Input.nextInt();
            System.out.println("you entered "+ value);
        }while(value != 3);
        System.out.println("correct!");
*/
    }


}
