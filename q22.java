// 22. Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.

import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 3 digit number - ");
        int num = sc.nextInt();

        int x = num/100;
        int y = (num/10)%10;
        int z = num%10;

        if(y>x && y>z){
            System.out.println("Middle digit is the largest");
        }else if(y<x && y<z){
            System.out.println("Middle digit is the smallest");
        }else{
            System.out.println("neither smallest nor largest");
        }
        sc.close();
    }
}
