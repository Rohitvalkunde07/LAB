import java.util.Scanner;
class Exercise8
{
	public static boolean positiveString(String str)
	{
		int len=str.length();
		char[] ch=new char[len];
		for(int i=0;i<len;i++)
		{
			ch[i]=str.charAt(i);
		}
		for(int i=0;i<len-1;i++)
		{
		   	if(ch[i]>ch[i+1])
			{
				return false;	
			}
		}
		return true;	
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(positiveString(str))
			System.out.println("Given String is a Positive String");
		else
			System.out.println("Given String is not a Positive String");
	}
}	