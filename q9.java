// 9. Take a character and check if it is a vowel or consonant.

import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Alphabet - ");
        char a = sc.next().charAt(0);           //sc.next() reads full word so we use chartAt() so it takes 1st character only.. 
        if (a=='a'||a =='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
            System.out.println("Its a vowel");
        } else {
            System.out.println("Its a consonant");
        }
        sc.close();
    }
}
