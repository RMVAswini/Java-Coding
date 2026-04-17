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
        while (T-- > 0)
        {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            int extraLeft = Math.max(0, n - m);
            int totalShoes = n + extraLeft;
            System.out.println(totalShoes);
        }
	}
}
