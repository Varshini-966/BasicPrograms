import java.util.*;
class AdvancedPattern1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        int k = num/2+1;
        for(int i = 1;i <= k;i++)
        {
            for(int j = 1;j <= k-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++)
            {
                System.out.print(j+"*");
            }
            System.out.println();
        }
        for(int i = 2;i <= k;i++)
        {
            for(int j = 1;j <= i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j <= k-i;j++)
            {
                System.out.print(j+"*");
            }
            System.out.println();
        }
    }
}