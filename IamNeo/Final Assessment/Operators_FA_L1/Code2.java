// You are using Java
import java.util.*;
import java.io.*;
class eq
{
    public static void main(String[] args)
    {
        int ans;
        Scanner sc =new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>0 & y>0 &z>0)
        {
            ans = -x+y*z;
            System.out.print(ans);
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}
