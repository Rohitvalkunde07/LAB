import java.util.*;
import java.util.*;
class Exercise1
{
	public static int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		 	
		return arr[1];
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=getSecondSmallest(arr);
		System.out.println("Second Smallest Element in Arrays is "+result);
	}
}