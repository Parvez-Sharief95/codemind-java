import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int m = scanner.nextInt();
        
        int count = 0;
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
       
        System.out.println(+ count);
    }
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}