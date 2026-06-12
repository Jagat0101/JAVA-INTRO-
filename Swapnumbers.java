import java.util.*;
public class Swapnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter your second number: ");
        b = sc.nextInt();

        swap(a,b);
    }
    // Creating a function to swap two numbers 
    static void swap(int a, int b){
        int temp = a;
         a = b;
         b = temp;
         System.out.println("After swaping values");
         System.out.println("a= " +a);
         System.out.println("b= " +b);
    }
}
