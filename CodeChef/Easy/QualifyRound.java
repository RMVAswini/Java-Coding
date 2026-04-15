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
		    int X =sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int score = (A*1)+(B*2);
		    if(score>=X)
		    {
		        System.out.println("Qualify");
		    }
		    else
		    {
		        System.out.println("NotQualify");
		    }
		}
	}
}
