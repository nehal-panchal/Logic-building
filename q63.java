// 63. Check if a number is a palindrome.  

import java.util.*;
public class q63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int num = sc.nextInt();
        int x = num ;

        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse*10 + digit;
            num = num / 10;
        }
        if(x == reverse){
            System.out.println("The number is Palindrome.");
        }else{
            System.out.println("The number is not Palindrome.");
        }
        sc.close();
    }
}