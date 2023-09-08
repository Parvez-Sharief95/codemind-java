import java.util.Scanner;
public class disk{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t,s,b,a;
        t = sc.nextInt();
        s = sc.nextInt();
        b = sc.nextInt();
        a = 512*2*t*s*b;
        System.out.println(a);
        
    }
}