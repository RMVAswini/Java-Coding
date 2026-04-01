import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
		  int A=sc.nextInt();
	      int B=sc.nextInt();
		  int C=sc.nextInt();
	      double avg = (A+B)/2.0;
		  if(avg>C)
	      {
		     System.out.println("YES");
		  }
		  else
		  {
		    System.out.println("NO");
		  }
       }
	}
}
