
import java.util.Scanner;

public class Conditional2 {
    public static void main(String[] args) {
        System.out.println("Multiple if else satement");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if(age <= 0){
            System.out.println("Error please enter proper age");
        }
        else if(age >= 12 && age <=13){
            System.out.println("You are not a teen");
        }
        else if(age >= 13 && age <= 18){
            System.out.println("You are a teenager");

        }else{
            System.out.println("You are an adult");
        }

    }
    
}
