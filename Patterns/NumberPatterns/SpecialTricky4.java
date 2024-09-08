package NumberPatterns;
import java.util.*;
public class SpecialTricky4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i <= num;i++)
        {
            int k = num;
            for(int j = 1;j <= i;j++)
            {
                System.out.print(k+" ");
                k--;
            }
            for(int j = 1;j <= (2*k-1);j++)
            {
                System.out.print((k+1)+" ");
            }
            if(k != 0)
            {
            for(int j = k+1;j <= num;j++)
            {
                System.out.print(j+" ");
            }
            }
            else
            {
                for(int j = 2;j <= num;j++)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        for(int i = 2;i <= num;i++)
        {
            int k = num;
            for(int j = 1;j <= num-i+1;j++)
            {
                System.out.print(k+" ");
                k--;
            }
            for(int j = 1;j <= (2*k-1);j++)
            {
                System.out.print((k+1)+" ");
            }
            if(k == 0)
            {
                for(int j = 2;j <= num;j++)
                {
                    System.out.print(j+" ");
                }
            }
            else
            {
                for(int j = k+1;j <= num;j++)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
