// 12. If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.
import java.util.*;

public class q12 {
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
                    if(a==b && b==c && c == a){
                        System.out.println("Equilateral Triangle");
                    }else if(a==b || b == c || c== a){
                        System.out.println("Isosceles Triangle");
                    }else{
                        System.out.println("Scalene Triangle");
                    }
                }else{
                    System.out.println("The three sides does not forms valid triangle");
                }
            }
        }
        sc.close();
    }
}
