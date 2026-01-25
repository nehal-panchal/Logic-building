// 42. Take three numbers and check if they can form a Pythagorean triplet

import java.util.*;

public class q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number - ");
        int a = sc.nextInt();

        System.out.print("Enter second number - ");
        int b = sc.nextInt();

        System.out.print("Enter third number - ");
        int c = sc.nextInt();

        if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
            System.out.println("Pythagorean Triplet");
        } else {
            System.out.println("Not a Pythagorean Triplet");
        }
        sc.close();
    }
}
