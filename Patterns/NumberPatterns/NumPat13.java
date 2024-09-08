package NumberPatterns;
import java.util.*;
public class NumPat13 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 0;i < num;i++)
        {
            for(int j = 1;j <= num;j++)
            {
                System.out.print((i+j)%2+" ");
            }
            System.out.println();
        }
    }
}
