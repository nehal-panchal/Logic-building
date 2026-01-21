// 29. Take two angles of a triangle and compute the third angle.

import java.util.*;
public class q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle - ");
        int a = sc.nextInt();

        System.out.print("Enter second angle - ");
        int b = sc.nextInt();

        int c = 180 - (a + b);

        if (c > 0) {
            System.out.println("Third angle is - " + c);
        } else {
            System.out.println("Invalid angles for a triangle");
        }
        sc.close();
    }
}
