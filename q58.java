// 58. Print the sum of all odd numbers up to n. 

import java.util.*;
public class q58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<= num; i+=2 ){
            sum = sum + i;
        }
        System.out.println("Sum of all odd number up to n - " + sum);
        sc.close();
    }
}
