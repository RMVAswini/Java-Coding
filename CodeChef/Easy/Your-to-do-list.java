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
		    int count = 0;
		    int N = sc.nextInt();
		    int[] D = new int[N];
		    for(int i=0;i<N;i++)
		    {
		        D[i]=sc.nextInt();
		        if(D[i]>=1000)
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
