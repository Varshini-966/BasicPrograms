// * * * * * 
//  * * * * * 
//   * * * * * 
//    * * * * * 
//     * * * * * 
import java.util.*;
class MirroredRhombus
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i <= num;i++)
        {
            for(int j = 1;j < i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j <= num;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}