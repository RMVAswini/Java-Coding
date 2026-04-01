// You are using Java
import java.util.*;
import java.io.*;
class grade
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt())
        {
            int mark = sc.nextInt();
            if(mark>=85 && mark<=100)
            {
                System.out.print("A");
            }
            else if(mark>=75 && mark<=84)
            {
                System.out.print("B");
            }
            else if(mark>=65 && mark<=74)
            {
                System.out.print("C");
            }
            else if(mark>=0 && mark<64)
            {
                System.out.print("D");
            }
            else
            {
                System.out.print("Invalid");
            }
        }
    }
}
