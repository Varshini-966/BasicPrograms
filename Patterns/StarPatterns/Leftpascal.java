// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
import java.util.*;
class Leftpascal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i <= (2*num-1);i++)
        {
            if(i <= num)
            {
                for(int j = 1;j <= num-i;j++)
                {
                    System.out.print(" "+" ");
                }
                for(int j = 1;j <= i;j++)
                {
                    System.out.print("*"+" ");
                }
            }
            else
            {
                for(int j = 1;j <= i-num;j++)
                {
                    System.out.print(" "+" ");
                }
                for(int j = 1;j <= 2*num-i;j++)
                {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
}