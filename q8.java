// Take a temperature value and print "Cold", "Warm", or "Hot" using range conditions.
import java.util.*;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();
        if (temp < 20) {
            System.out.println("Cold");
        } 
        else if (temp >= 20 && temp <= 30) {
            System.out.println("Warm");
        } 
        else {
            System.out.println("Hot");
        }
        sc.close();
    }
}
