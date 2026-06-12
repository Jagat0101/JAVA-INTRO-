import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        // Take input of two numbers and print the output of that 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The sum of two numbers is  " + c);

    }
}
