// Check if a given year is a leap year.

import java.util.*;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year - ");
        int x = sc.nextInt();
        if((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)){ 
            System.out.println("The year is Leap Year");
        }else{
            System.out.println("The year is not a Leap Year");
        }
    }
}

// Here we use x % 100 != 0 this because if we take example 1900 is divisible by 4 so but it is not leap year so we used this.. 