// 27. Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.

import java.util.*;

public class q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount - ");
        int num = sc.nextInt();

        int note2k = num / 2000;
        int rem1 = num % 2000;

        int note500 = rem1 / 500;
        int rem2 = rem1 % 500;

        int note100 = rem2 / 100;
        int rem3 = rem2 % 100;

        if (rem3 == 0) {
            System.out.println("Amount can be evenly divided");
            System.out.println("2000 notes - " + note2k);
            System.out.println("500 notes - " + note500);
            System.out.println("100 notes - " + note100);
        } else {
            System.out.println("Amount cannot be evenly divided into 2000, 500 and 100 notes");
        }

        sc.close();
    }
}
