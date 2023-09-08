import java.util.Scanner;
public class triangle{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double A,B,C,S,area;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        S = (A+B+C)/2;
        area = Math.sqrt(S * (S-A) * (S-B) * (S-C));
        System.out.printf("%.2f",area);
        
    }
}