import java.util.Scanner;
class Exercise4
{
	public static int modifyNumber(int num)
	{
		String str= String.valueOf(num);
		StringBuffer result=new StringBuffer("");
		int len=str.length();
		char[] ch=new char[len];
		
		for(int i=0;i<len;i++)
		{
			ch[i]=str.charAt(i);
		}

		for(int i=0;i<len-1;i++)
		{
			int ans=(int)ch[i]-(int)ch[i+1];
			if(ans<0)
				ans=ans*-1;
			 result.append(String.valueOf(ans));
				
		}

		 result.append(String.valueOf(ch[len-1]));
		int ans=Integer.parseInt(result.toString());
		return ans;	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int ans=modifyNumber(num);
		System.out.println(ans);		
	}
}