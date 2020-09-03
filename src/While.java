import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        int value = 1;
//        while(value<10) {
//            System.out.println("loop "+ value );
//            value= value+1;
//        }
        // Create scanner object
        Scanner Input = new Scanner(System.in);
        String day;
        // Output the prompt
        System.out.println("Enter your day: ");
        // Wait for the user to enter something.
        day = Input.nextLine();
        // Tell them what they entered.
        System.out.println("you entered " + day);
        while (day.equals("today")) {
            System.out.println("you entered correct!" + day);
            break;
        }
    }
}
