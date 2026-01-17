// 15. Take the hour of the day (0–23) and print: “Good Morning” “Good Afternoon” “Good Evening” “Good Night”

import java.util.*;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour (0-23) - ");
        int hour = sc.nextInt();

        if (hour >= 5 && hour < 12) {
            System.out.println("Good Morning");
        }else if (hour >= 12 && hour < 17) {
            System.out.println("Good Afternoon");
        }else if (hour >= 17 && hour < 21) {
            System.out.println("Good Evening");
        }else if (hour >= 0 && hour < 24) {
            System.out.println("Good Night");
        }else {
            System.out.println("Invalid Hour");
        }
        sc.close();
    }
}