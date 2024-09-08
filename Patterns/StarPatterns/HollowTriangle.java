//     * 
//    * * 
//   *   * 
//  *     * 
// * * * * * 
import java.util.*;
class HollowTriangle
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
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++)
            {
                if(j == 1 || (j == i && j != 1)|| i == num)
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}