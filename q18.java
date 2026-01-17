// 18. Take an alphabet character and check if it lies between: ‘a’ and ‘m’, or ‘n’ and ‘z’

import java.util.*;
public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character - ");
        char ch = sc.nextLine().charAt(0);
        if(ch <= 'm' && ch>= 'a' ){
            System.out.println("Character lies between 'a' and 'm'");
        }else{
            System.out.println("Character lies between 'n' and 'z'");
        }
        sc.close();
    }
}
