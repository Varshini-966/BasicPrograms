package NumberPatterns;
import java.util.*;
public class NumPat12 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i <= num;i++)
        {
            for(int j = i;j >= 1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
