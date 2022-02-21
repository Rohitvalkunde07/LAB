import java.util.*;

class Exercise8
{
	public static boolean checkNumber(int n)
	{
	 if(n%2==0)
		{
		  n=n/2;
		   if(n==2)
			   return true;
		    else
			   return checkNumber(n);
		}
		else
		{
			return false;
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
	
		if(checkNumber(n))
			System.out.println(n+": is power of two");
		else
			System.out.println(n+": is not power of two");
	}
}