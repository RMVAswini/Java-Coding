import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N]; 
		int odd=0;
		int even=0;
		for(int i=0;i<N;i++)
		{
		    arr[i] = sc.nextInt(); 
		    if(arr[i]%2==0)
		    {
		        even++;
		    }
		    else
		    {
		        odd++;
		    }
		}
		if(even>odd)
		{
		    System.out.println("READY FOR BATTLE");
		}
		else
		{
		    System.out.println("NOT READY");
		}
	}
}
