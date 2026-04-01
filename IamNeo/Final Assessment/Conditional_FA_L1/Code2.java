// You are using Java
import java.io.*;
import java.util.*;
class score
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int n = sc.nextInt();
            if(n<1 || n>9)
            {
                System.out.print("Invalid Input");
            }
            if(sc.hasNext())
            {
                String ch = sc.next();
                char c = ch.charAt(0);
                if(c=='r')
                {
                    System.out.print(n+5);
                }
                else
                {                                   
                    System.out.print(n);
                }
            }
            
        }
    }
}
