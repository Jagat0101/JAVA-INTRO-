import  java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Program to calculate Simple Interest");
        int P , R , T;
        P = 1000;
        R = 5;
        T = 2;
        int SI = (P * R * T) / 100;
        System.out.println("The Simple Interest is " + SI);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal Amount: ");
        P = sc.nextInt();
        System.out.print("Enter the Rate of Interest: ");
        R = sc.nextInt();
        System.out.print("Enter the Time Period: ");
        T = sc.nextInt();
        Si(P, R, T);
    }

    static void Si(int p , int r , int t){
        int SI = (p * r * t) / 100;
        System.out.println("The Simple Interest is " + SI);
        
    }
}
