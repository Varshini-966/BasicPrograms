package NumberPatterns;
import java.util.*;
public class ZeroOne 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i <= num;i++)
        {
            for(int j = 0;j < i;j++)
            {
                System.out.print((j+i)%2+" ");
            }
            System.out.println();
        }
    }
}
