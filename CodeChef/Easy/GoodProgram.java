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
		    int nibble = N%4;
		    if(nibble == 0)
		    {
		        System.out.println("Good");
		    }
		    else
		    {
		        System.out.println("Not Good");
		    }
		}

	}
}
