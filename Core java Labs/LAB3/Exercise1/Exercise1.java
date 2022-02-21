import java.util.StringTokenizer;
class Exercise1
{
	public static void main(String[] args)
	{
		StringTokenizer st=new StringTokenizer("10 20 30 40 50");
		int sum=0;
		while(st.hasMoreTokens())
		{
			int digit=Integer.parseInt(st.nextToken());
			sum=sum+digit;	
			System.out.println(digit);
		}
		System.out.println("Sum of digits:-"+sum);
	}	
}