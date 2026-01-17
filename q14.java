// 14. Check if one of two given numbers is a multiple of the other.
import java.util.*;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number - ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number - ");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("First number is a multiple of second number");
        }
        else if (num2 % num1 == 0) {
            System.out.println("Second number is a multiple of first number");
        }
        else {
            System.out.println("The numbers are not multiples of each other");
        }

        sc.close();
    }
}
