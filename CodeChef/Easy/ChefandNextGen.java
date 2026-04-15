import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
		    int A = sc.nextInt();
		    int B  = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int total = A*B;
		    int cap = X*Y;
		    if(cap>=total)
		    {
		        System.out.println("Yes");
		    }
		    else
		    {
		        System.out.println("No");
		    }
		}
	}
}
