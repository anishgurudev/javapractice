import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculater {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float annual_interest = 0;
        float monthly_interest = 0;
        int no_of_payment = 0;

        Scanner Input = new Scanner(System.in);

        while (true) {
            //output to user
            System.out.println("Enter your Principal");
            principal = Input.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a principal Amount between 1000 - 1000000");
        }

        while (true) {
            //output to user
            System.out.println(" Enter annual Interest rate");
            annual_interest = Input.nextFloat();
            if (annual_interest >= 1 && annual_interest <= 30) {
                monthly_interest = annual_interest / PERCENT / MONTHS_IN_YEARS;
                break;
            }
            System.out.println("Enter a value Greater than 0 and less than 30");
        }
        while (true) {
            System.out.println("Enter the time(years)");
            byte years = Input.nextByte();
            if (years >= 1 && years <= 30) {
                no_of_payment = years * MONTHS_IN_YEARS;
                break;
            }
            System.out.println("Enter time period in years between 1 - 30 ");
        }

        String mortageFormat = NumberFormat.getCurrencyInstance().format(calculateMortage(principal, monthly_interest, no_of_payment));
        System.out.println("Mortage : " + mortageFormat);
    }

    public static double calculateMortage(int principal, float monthly_interest, int no_of_payment) {
        double mortage = principal *
                (monthly_interest * Math.pow(1 + monthly_interest, no_of_payment) /
                        (Math.pow(1 + monthly_interest, no_of_payment) - 1));
        return mortage;
    }

//    public static int principal(){
//        int principal;
//        while (true) {
//            //output to user
//            System.out.println("Enter your Principal");
//            Scanner Input = new Scanner(System.in);
//            principal = Input.nextInt();
//            if (principal >= 1_000 && principal <= 1_000_000)
//                break;
//            System.out.println("Enter a principal Amount between 1000 - 1000000");
//        }
//        return principal;
//    }
}



