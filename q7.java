// Take three numbers and print the largest number.
import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter frist number - ");
        int first = sc.nextInt();
        System.out.print("Enter second number - ");
        int second = sc.nextInt();
        System.out.print("Enter third number - ");
        int third = sc.nextInt();
        
        if((first > second) &&(first> third) ){
            System.out.print("First number is greater");
        }else if(( second > first) &&( second > third ) ){
            System.out.print("Second number is greater");
        }else if((third > first)&& (third>second)){
            System.out.print("Third number is greater");
        }
        sc.close();
    }
}
