// 16. Check voting eligibility for a given age (18+).
import java.util.*;
public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age - ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else if (age >= 0) {
            System.out.println("Not eligible to vote");
        } else {
            System.out.println("Invalid age");
        }
        sc.close();
    }
}
