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
		    int rev=0;
		    int N = sc.nextInt();
		    while(N!=0)
		    {
		        int rem = N%10;
		        rev = rev*10+rem;
		        N/=10;
		        System.out.println(rev);
		    }
		}
	}
}
