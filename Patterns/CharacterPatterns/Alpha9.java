package CharacterPatterns;
import java.util.*;
public class Alpha9 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        char c = 'A';
        for(int i = 1;i <= num;i++)
        {
            for(int j = 1;j <= num;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}