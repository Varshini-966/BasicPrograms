import java.util.*;
public class Q {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i <= num+1;i++)
        {
            for(int j = 1;j <= num+1;j++)
            {
                if((i == 1 && j != num+1)|| (i == num && j != num+1)|| (j == 1 && i != num+1) || (j == num && i != num+1) || (i >= num/2+1 && i == j))
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
