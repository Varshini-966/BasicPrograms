//         * *
//       *     *       
//     *         *     
//   *             *   
// *                 * 
// *                 * 
// *                 * 
// *                 * 
// *                 * 
// * * * * * * * * * *
import java.util.*;
class Pentagon
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i <= 2*num;i++)
        {
            for(int j = 1;j <= 2*num;j++)
            {
                if((i > num && (j == 1 || j == 2*num))|| j == num-i+1 || j == num+i|| i == 2*num)
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