import java.util.Scanner;
public class KeyBoard {
    public static void main(String[] args){
        System.out.println("Taking input from user:");
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = s1.nextInt();
        System.out.println("Enter second number:");
        int b = s1.nextInt();
        int sum = a+b;
        System.out.println("Sum of the num is: ");
        System.out.println(sum);
    }
    
}
