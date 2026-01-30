// 64. Find the sum of digits of a number.  

import java.util.*;
public class q64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number - ");
        int num = sc.nextInt();

        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        System.out.println("The sum of the digits is - "+ sum);
        sc.close();
    }
}
