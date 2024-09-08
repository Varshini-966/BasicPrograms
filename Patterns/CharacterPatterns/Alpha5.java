package CharacterPatterns;
import java.util.*;
public class Alpha5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        char key = sc.next().charAt(0);
        int num = key-65+1;
        //System.out.print(num);
        char c = 'A';
        for(int i = 1;i <= num;i++)
        {
            for(int j = 1;j <= num-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j <= i;j++)
            {
                if(j == 1 || j == i)
                {
                    System.out.print(c+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
            c++;
        }
        c-= 2;
        for(int i = 2;i <= num;i++)
        {
            for(int j = 1;j < i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j <= num-i+1;j++)
            {
                if(j == 1 || j == (num-i)+1)
                {
                    System.out.print(c+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
            }
            c--;
            System.out.println();
        }
    }
}
