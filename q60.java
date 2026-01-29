// 60. Print the product of digits of a given number. 

import java.util.*;
public class q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int num = sc.nextInt();

        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            product *= digit;
            num = num / 10;
        }
        System.out.println("Product of digit of a given number - " + product);
        sc.close();
    }
}
