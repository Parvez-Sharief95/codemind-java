import java.util.Scanner;
public class Cars
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1,n2,x,y;
        n1=sc.nextInt();
        n2=sc.nextInt();
        x=sc.nextInt();
        y=((x+n1)/n2)+1;
        if(n2<n1)
        {
            System.out.println(-1);
        }
        else 
        {
            System.out.println(y);
        }
    }
}