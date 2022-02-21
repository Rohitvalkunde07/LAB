import java.util.Scanner;
class Exercise2
{
	public static String getImage(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		rev=str+"|"+rev;
	    return rev;
	}
		

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ans=getImage(str);
		System.out.println(ans);	
	}	
}