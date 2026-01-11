//  Check if a number is even or odd.
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("The number is EVEN");
        }else{
            System.out.println("The number is ODD");
        }
    }
}
