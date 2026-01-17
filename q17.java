// 17. Take two numbers and determine whether: both are even both are odd , one is even and one is odd

import java.util.*;
public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number - ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number - ");
        int num2 = sc.nextInt();

        if(num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println("Both are Even Number");
        }else if(num1 % 2 != 0 && num2 % 2 != 0){
            System.out.println("Both are Odd Number");
        }else{
            System.out.println("One is Even and One is Odd");
        }
        sc.close();
    }
}
