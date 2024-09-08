package CharacterPatterns;
import java.util.*;
public class Alpha2 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        for(int i = 1;i <= num;i++)
        {
            char c = 'A';
            for(int j = 1;j <= i;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
