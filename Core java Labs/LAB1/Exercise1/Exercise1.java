import java.util.*;

class Exercise1
{
	public static int sumCube(int num)
	{
		int sum = 0;
		
		while(num>0)
		{
			int digit = num%10;
			sum = sum + digit*digit*digit;
			num = num/10;
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		int res = sumCube(num);

		System.out.println("Sum is :"+res);
	}
}