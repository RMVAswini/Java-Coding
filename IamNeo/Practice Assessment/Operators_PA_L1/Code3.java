// You are using Java
import java.util.*;
import java.io.*;
class area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        float area=l*b;
        if(l>0&&b>0)
        {
            System.out.print(area);
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}
