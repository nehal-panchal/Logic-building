// 67. Print all prime numbers between 1 and 100.  

public class q67{
    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) {
            if (num <= 1)
                continue;

            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(num + " ");
        }
    }
}
