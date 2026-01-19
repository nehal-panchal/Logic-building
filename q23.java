// 23. Take a 4-digit number and check if the first and last digits are equal.

import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4 digit number - ");
        int num = sc.nextInt();

        int first = num / 1000;
        int last = num % 10;

        if (first == last) {
            System.out.println("First and last digits are equal");
        } else {
            System.out.println("First and last digits are not equal");
        }

        sc.close();
    }
}
