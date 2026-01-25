// 40. Take a password string and check basic rules (length ≥ 8 and contains at least one digit)

import java.util.*;

public class q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String pass = sc.nextLine();

        boolean hasDigit = false;

        if (pass.length() >= 8) {
            for (int i = 0; i < pass.length(); i++) {
                char ch = pass.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    hasDigit = true;
                    break;
                }
            }

            if (hasDigit) {
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid password");
            }
        } else {
            System.out.println("Invalid password");
        }

        sc.close();
    }
}
