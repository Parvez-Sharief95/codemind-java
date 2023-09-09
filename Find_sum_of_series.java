import java.util.*;
public class series{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float res=0;
        for(float i=1;i<=n;i++)
        {
            res += (1/i);
        }
        System.out.printf("%.2f",res);
    }
}