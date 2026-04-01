// You are using Java
import java.io.*;
import java.util.*;
class movie
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int age = sc.nextInt();
            if(age<15)
            {
                System.out.print("Welcome to the show"+"\n"+"Please note that you should be accompanied by an adult");
            }
            else
            {
                System.out.print("Welcome to the show");
            }
        }
    }
}
