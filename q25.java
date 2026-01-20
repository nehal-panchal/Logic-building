// 25. Check if a number is a multiple of 7 or ends with 7.

import java.util.*;

public class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int num = sc.nextInt();

        if(num % 7 == 0 || num%10 == 7 ){
            System.out.println("Number is multiple of 7 or ends with 7");
        }else{
            System.out.println("Number is multiple of 7 or ends with 7");
        }
        sc.close();
    }
}