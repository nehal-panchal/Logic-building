// 65. Check if a number is an Armstrong number.  

import java.util.*;
public class q65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int num = sc.nextInt();
        int temp = num;

        int sum = 0;
        while(temp>0){
            int digit = temp%10;
            sum = sum + (digit*digit*digit);
            temp = temp/10;
        }
        if(num == sum){
            System.out.println("The number is an Armstrong number.");
        }else{
            System.out.println("The number is now an Armstrong number.");
        }
        sc.close();
    }
}
