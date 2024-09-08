package Numbers;
import java.util.*;
public class Four {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i<= num;i++)
        {
            for(int j = 1;j <= num;j++)
            {
               if(j == num || i == num/2+1 || (j == 1 && i <= num/2+1))
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
