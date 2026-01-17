// 13. Take marks (0–100) and print the corresponding grade (A / B / C / D / F).

import java.util.*;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks - ");
        int marks = sc.nextInt();

        if (marks >= 80 && marks <= 100) {
            System.out.println("A Grade");
        } 
        else if (marks >= 60 && marks < 80) {
            System.out.println("B Grade");
        } 
        else if (marks >= 40 && marks < 60) {
            System.out.println("C Grade");
        } 
        else if (marks >= 33 && marks < 40) {
            System.out.println("D Grade");
        } 
        else if (marks >= 0 && marks < 33) {
            System.out.println("F Grade");
        } 
        else {
            System.out.println("Invalid Marks");
        }
        sc.close();
    }
}
