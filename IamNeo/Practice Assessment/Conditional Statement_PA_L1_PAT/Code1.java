// You are using Java
import java.util.*;
import java.io.*;
class TicketType
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<15)
        {
            System.out.print("Child Ticket");
        }
        else
        {
            System.out.print("Adult Ticket");
        }
    }
}
