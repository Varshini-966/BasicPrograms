package NumberPatterns;
import java.util.*;
public class NumberIncreasingPyramidReversed 
{
    public static void main(String args[])
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
    }
}