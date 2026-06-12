public class Countnumber {
    public static void main(String[] args) {
        System.out.println("A program to count the number of digits in a given number");
        int x = 10578;
        int count = 0;
        while(x != 0){
            x = x/10;
            count++;
        }
        System.out.println("The number of digits in the given number is " + count);
    }
}
