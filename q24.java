// 24. Check whether a given integer is single-digit, double-digit, or multi-digit
import java.util.*;

public class q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number - ");
        int n = sc.nextInt();

        int num = Math.abs(n); // remove negative sign

        if (num < 10) {
            System.out.println("Single digit number");
        } else if (num < 100) {
            System.out.println("Double digit number");
        } else {
            System.out.println("Multi digit number");
        }
        sc.close();
    }
}

/* 
    String s = Integer.toString(Math.abs(n)); // convert number to string
    int digits = s.length();                  // length of string
*/

// 2nd logic 

