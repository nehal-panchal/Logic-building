// 28. Check if a number lies within the range [100, 999].

import java.util.*;

public class q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number - ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            System.out.println("Number lies within the range 100 to 999");
        } else {
            System.out.println("Number does not lie within the range 100 to 999");
        }
        sc.close();
    }
}
