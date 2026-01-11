// Take a number and print whether it is positive, negative, or zero. 

import java.util.*;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int n = sc.nextInt();

        if(n>0){
            System.out.println("Positive Number");
        }else if(n<0){
            System.out.println("Negative Number");
        }else{
            System.out.println("The number is Zero");
        }
    }
}