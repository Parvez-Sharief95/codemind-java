import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p1, p2, p3, p4;
        p1 = scanner.nextInt();
        p2 = scanner.nextInt();
        p3 = scanner.nextInt();
        p4 = scanner.nextInt();
        if (p1 >= 10 && p2 >= 10 && p3 >= 10 && p4 >= 10)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
