import java.util.Scanner;
public class Square
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n,i,j,c=0;
        n=sc.nextLong();
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=i;j++)
            {
                if(i*i+j*j==n)
                {
                    c++;
                }
            }
        }
        if(c!=0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}