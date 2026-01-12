// Take two numbers and print the larger one.
import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter frist number - ");
        int first = sc.nextInt();
        System.out.print("Enter second number - ");
        int second = sc.nextInt();

        if(first<second){
            System.out.println("Second number is greater");
        }else{
            System.out.println("First number is greater");
        }

    }
}
