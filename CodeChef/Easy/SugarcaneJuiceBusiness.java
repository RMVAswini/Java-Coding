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
		    int cost = 50*N;
		    int sugar = (20*cost)/100;
		    int salt = (20*cost)/100;
		    int rent = (20*cost)/100;
		    int total = sugar+salt+rent;
		    System.out.println(cost-total);
		}
	}
}
