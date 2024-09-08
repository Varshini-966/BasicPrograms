package Numbers;
import java.util.*;
public class Ten {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i  <= num;i++)
        {
            for(int j = 1;j <= num;j++)
            {
                if(j == 1 || j == 3 || j == num || (i == 1 && j >= 3)||(i == num && j >= 3))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
}
