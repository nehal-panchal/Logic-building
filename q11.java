// 11. Take three sides and check if they form a valid triangle. 

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side A - ");
        int a = sc.nextInt();
        System.out.print("Enter the side B - ");
        int b = sc.nextInt();
        System.out.print("Enter the side C - ");
        int c = sc.nextInt();
        
        if(a<(b+c)){
            if(b<(a+c)){
                if(c<(a+b)){
                    System.out.println("The three sides forms a valid triangle");
                }else{
                    System.out.println("The three sides does not forms valid triangle");
                }
            }
        }
        sc.close();
    }
}