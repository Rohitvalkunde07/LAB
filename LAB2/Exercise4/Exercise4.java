import java.util.*;
import java.util.*;
class Exercise4
{
	public static int[] modifyArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					arr[j]=0;
			}	
		}
		Arrays.sort(arr);
		return arr;
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
		int a[]=modifyArray(arr);
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]!=0)
				System.out.println("Sorted Array Without Duplicates"+a[i]);
		}		
	}
}