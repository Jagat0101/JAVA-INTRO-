
import java.util.Scanner;

public class DollartoINR {
    public static void main(String[] args) {
        System.out.println("The proce of one dollar in INR is 76.23");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in INR: ");
        double inr = sc.nextDouble();
        double dollars = inr / 76.23;
        System.out.println("The amount in dollars is: " + dollars);
    }
}
