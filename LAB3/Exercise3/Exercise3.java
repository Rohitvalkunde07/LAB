import java.util.Scanner;
class Exercise3
{
	public static String alterString(String str)
	{
		int len=str.length();
		char[] ch=new char[len];
		for(int i=0;i<len;i++)
		{
			ch[i]=str.charAt(i);
		}
		for(int i=0;i<len;i++)
		{
			if(ch[i]!='a' && ch[i]!='e' && ch[i]!='i' && ch[i]!='o' && ch[i]!='u' && ch[i]!='A' && ch[i]!='E' && ch[i]!='I' && ch[i]!='O' && ch[i]!='U')
			{
				int temp=ch[i];
				ch[i]=(char)(temp+1);	
			}
			 	
		}
		return String.valueOf(ch);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ans=alterString(str);
		System.out.println(ans);
	}
}
		