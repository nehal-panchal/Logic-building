// 61. Count the number of digits in a given number. 

import java.util.*;
public class q61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int num = sc.nextInt();

        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                count++;
                num = num / 10;
            }
        }
        System.out.println("Count of digits = " + count);
        sc.close();
    }
}
