// 41. Take coordinates (x, y) and check position

import java.util.*;

public class q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate - ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate - ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Point lies at the Origin");
        } else if (x == 0) {
            System.out.println("Point lies on the Y axis");
        } else if (y == 0) {
            System.out.println("Point lies on the X axis");
        } else {
            System.out.println("Point does not lie on X axis, Y axis, or Origin");
        }

        sc.close();
    }
}
