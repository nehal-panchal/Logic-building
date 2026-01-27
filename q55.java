// 55. Print the table of a given number (n × 1 to n × 10).

import java.util.*;

public class q55 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int num = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(num + "x"+ i + "=" + num*i);
        }
        sc.close();
    }
}
