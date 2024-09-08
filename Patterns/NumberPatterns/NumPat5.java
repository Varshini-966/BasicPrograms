package NumberPatterns;
import java.util.*;
public class NumPat5 
{
    public static void main(String arhs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i <= num;i++)
        {
            for(int j = 1;j <= num-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = 2;i <= num;i++)
        {
            for(int j = 1;j <= i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
