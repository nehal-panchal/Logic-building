// 34. Take 24-hour time (hours and minutes) and print whether it is AM or PM.

import java.util.*;

public class q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours (0–23) - ");
        int hour = sc.nextInt();

        if (hour >= 0 && hour < 12) {
            System.out.println("AM");
        } else if (hour >= 12 && hour <= 23) {
            System.out.println("PM");
        } else {
            System.out.println("Invalid time");
        }
        sc.close();
    }
}
