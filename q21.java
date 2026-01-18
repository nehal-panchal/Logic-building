// 21. Take a 3-digit number and check if all digits are distinct.

import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 digit number - ");
        int num = sc.nextInt();

        int x = num/100;
        int y = (num/10)%10;
        int z = num%10;

        if(x!=y && y!=z && z!=x){
            System.out.println("All the digit are distinct.");
        }else{
            System.out.println("The digit are not distinct");
        }
        sc.close();
    }
}
