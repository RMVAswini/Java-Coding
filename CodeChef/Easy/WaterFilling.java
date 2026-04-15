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
		   int count=0;
		   int B1=sc.nextInt();
		   int B2=sc.nextInt();
		   int B3=sc.nextInt();
		   for(int v:new int[]{B1,B2,B3})
		   {
		       if(v==0)
		       {
		           count++;
		       }		       
		   }
		  if(count>=2)
		  {
		     System.out.println("Water filling time");  
		  }
		  else
		  {
		     System.out.println("Not now");
		  }  
		}
	}
}
