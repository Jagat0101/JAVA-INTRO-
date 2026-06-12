
import java.util.Scanner;

public class Scannerclass {
    public static void main(String[] args) {
        System.out.println("This is the first lesson of java");
        System.out.println("Here will learn Scanner class");
        System.out.println("Enter a number");
        System.out.println("Enter your name");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); // nextInt() takes integer values of user
        System.out.println(a);
        
        System.out.println();
        System.out.println();// Added some extra line to make the output more presentable 
        
        String b = input.nextLine();//nextLine takes String values as input 
        System.out.println(b);
    }
    
}