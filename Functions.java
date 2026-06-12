import java.util.*;
public class Functions {
    public static void main(String[] args) {
        //Create a function in Java that takes input of two numbers and prints the output 
        //sum();
        //int ans = sum1();
        //System.out.println(ans);
        int value = sum3(5, 10);
        System.out.println(value);
    }
    // here it is a void function , which returns the entire line of codes which are written inside it 
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The sum of two numbers is  " + c);
    }

    //To return the value we have to use the return statement inside the code 
    static int sum1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int c = a + b;
        return c;

    }
    // Pass the value of funtions while we are calling it tself 
    static int sum3(int a , int b){
        int c = a + b;
        return c;
    }

}
