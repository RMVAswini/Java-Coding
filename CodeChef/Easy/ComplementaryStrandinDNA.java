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
            String s = sc.next();
            StringBuilder res = new StringBuilder();
            for (char c : s.toCharArray())
            {
                if (c == 'A') 
                    res.append('T');
                else if (c == 'T') 
                    res.append('A');
                else if (c == 'C') 
                    res.append('G');
                else if (c == 'G')
                    res.append('C');
            }
            System.out.println(res.toString());
        }
	}
}
