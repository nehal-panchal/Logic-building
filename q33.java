// 33. Take three numbers and print the median value

import java.util.*;
public class q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number - ");
        int a = sc.nextInt();

        System.out.print("Enter second number - ");
        int b = sc.nextInt();

        System.out.print("Enter third number - ");
        int c = sc.nextInt();

        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println("Median value is - " + a);
        } else if ((b > a && b < c) || (b > c && b < a)) {
            System.out.println("Median value is - " + b);
        } else {
            System.out.println("Median value is - " + c);
        }
        sc.close();
    }
}
