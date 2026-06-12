
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println( "This program demonstrates for loop");
        for(int i = 1 ; i <= 5 ; i += 1){
            System.out.println(i);
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value ");
        int i = scanner.nextInt();
    
        for (int n = 1 ; n <= i ; n++){
            System.out.println("*");
        }
        System.out.println("This program printed the same number of stars which you the given the value of i");
    }
    
}
