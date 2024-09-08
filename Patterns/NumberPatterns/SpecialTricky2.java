package NumberPatterns;
import java.util.*;
public class SpecialTricky2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i <= num;i++)
        {
            int k = num-1;
            int ele = i;
            System.out.print(i+" ");
            for(int j = 2;j <= i;j++)
            {
                System.out.print((ele+k)+" ");
                ele = ele+k;
                k--;
            }
            System.out.println();
        }
    }
}
