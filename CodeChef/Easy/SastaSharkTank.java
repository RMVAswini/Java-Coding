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
		    int B = sc.nextInt();
		    int P1 = (100/10)*A;
		    int P2 = (100/20)*B;
		    if(P1==P2)
		    {
		        System.out.println("ANY");
		    }
		    else if(P1>P2)
		    {
		        System.out.println("FIRST");
		    }
		    else
		    {
		        System.out.println("SECOND");
		    }
		}
	}
}
