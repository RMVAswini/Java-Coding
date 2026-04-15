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
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    int sub;
		    if(N>6)
		    {
		        sub = (int)Math.ceil((double)N/6);
		        X=X*sub;
		    }
		    System.out.println(X);
		}
		
	}
}
