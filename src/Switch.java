import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();

        switch (text) {
            case "start":
                System.out.println("code started!");
                break;
            case "stop":
                System.out.println("code stopped.");
                break;
            case "run":
                System.out.println("code runing.");
                break;
            case "debug":
                System.out.println("code debuging.");
                break;

            default:
                System.out.println("Command not recognized");
                break;
        }


    }
}
