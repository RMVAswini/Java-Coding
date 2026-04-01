// You are using Java
import java.io.*;
import java.util.*;
class asciival
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int x = sc.nextInt();
            String ch =sc.next();
            char a = ch.charAt(0);
            if(x<=500)
            {
                System.out.print(x+(int)a);
            }
            else
            {
                System.out.print("Invalid");
            }
        }
    }
}
