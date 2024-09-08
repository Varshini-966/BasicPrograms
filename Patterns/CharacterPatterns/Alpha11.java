package CharacterPatterns;
import java.util.*;
public class Alpha11 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        char key = sc.next().charAt(0);
        char c = key;
        for(int i = 1;i <= 5;i++)
        {
            for(int j = 1;j <= i;j++)
            {
                System.out.print(c+" ");
                if(c == 90)
                {
                    c = 65;
                }
                else
                {
                    c++;
                }
            }
            System.out.println();
        }
    }
}
