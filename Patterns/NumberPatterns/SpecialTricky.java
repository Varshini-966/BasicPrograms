package NumberPatterns;
import java.util.*;
public class SpecialTricky 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i <= num;i++)
        {
            for(int j = 1;j <= num-i;j++)
            {
                System.out.print("1"+" ");
            }
            for(int j = 1;j <= i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
