import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc  = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    if(N>X)
		    {
		         int pack = (int) Math.ceil((double)(N-X)/4);
		         System.out.println(pack);
		    }
		    else{
		        System.out.println("0");
		    }
		}
	}
}
