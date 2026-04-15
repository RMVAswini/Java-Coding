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
		    int P = sc.nextInt();
		    int Q = sc.nextInt();
		    int R = sc.nextInt();
		    int S = sc.nextInt();
		    int max = Collections.max(List.of(P, Q, R, S));
		    int sum = (P+Q+R+S)-max;
		    if(max>sum)
		    {
		        System.out.println("YES");
		    }
		}
	}
}
