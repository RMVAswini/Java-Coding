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
		    int X = sc.nextInt();
		    int[] arr = new int[N];
		    for(int i=0;i<N;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    for(int i=0;i<N;i++)
		    {
		        if(arr[i]>=X)
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
