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
		int piece = 4;
		while(T-->0)
		{
		    int count=0;
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    int slice = X*N;
		    count = (int) Math.ceil((double)slice/piece);
		    System.out.println(count);
		    
		}
	}
}
