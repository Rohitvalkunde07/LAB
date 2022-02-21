import java.util.*;
class NullNameException extends Exception
{
	NullNameException(String str)
	{
		super(str);
	}
}

class Exercise2
{
	public static String validateName(String str1,String str2) throws NullNameException
	{
		if(str1.length()==0||str2.length()==0)
		  throw new NullNameException("first or last Name is blank");
		else
		return "true";
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String firstName="Rohit";
		String lastName="valkunde";
		try
		{
			validateName(firstName,lastName);
			System.out.println(firstName+" "+lastName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}