import java.util.*;
import java.util.*;
class Exercise2
{
	public static String sortStrings(char arr[])
	{
		Arrays.sort(arr);
		String upper="",lower="";
		int len=arr.length;
		if(len%2==0)
		{
			for(int i=0;i<len/2;i++)
			{
				upper=upper+arr[i];
			}
			for(int i=len/2;i<len;i++)
			{
				lower=lower+arr[i];
			}
		}
		else
		{
		
			for(int i=0;i<(len/2)+1;i++)
			{
				upper=upper+arr[i];
			}
			for(int i=(len/2)+1;i<len;i++)
			{
				lower=lower+arr[i];
			}
		}
		String ans=upper.toUpperCase()+lower.toLowerCase();
		return ans;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] arr=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
		}
		String result=sortStrings(arr);
		System.out.println(result);		
	}
}