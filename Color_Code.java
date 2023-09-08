import java.util.Scanner;
public class color{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
         if(n=='V'|| n=='v')
        {
            System.out.println("Violet");
        }
        else if(n=='I' || n=='i')
        {
            System.out.println("Indigo");
        }
        else if(n=='B' || n=='b')
        {
            System.out.println("Blue");
        }
        else if(n=='G' || n=='g')
        {
            System.out.println("Green");
        }
        else if(n=='Y' || n=='y')
        {
            System.out.println("Yellow");
        }
        else if(n=='O' || n=='o')
        {
            System.out.println("Orange");
        }
        else if(n=='R' || n=='r')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println(-1);
        }
    }
}