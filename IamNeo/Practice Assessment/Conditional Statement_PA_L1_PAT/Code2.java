// You are using Java
import java.util.*;
import java.io.*;
class Ticket
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int num = sc.nextInt();
            if(num%10 == 3 || num%10 == 8)
            {
                System.out.print("Lucky Winner");
            }
            else
            {
                System.out.print("Not a Lucky Winner");
            }
        }
    }
}
