// 68. Check if a number is prime or not. 

import java.util.*;
public class q68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number - ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("The number is not Prime");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println("The number is Prime");
            else
                System.out.println("The number is not Prime");
        }
        sc.close();
    }
}
