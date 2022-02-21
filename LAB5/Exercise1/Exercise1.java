class AgeException extends Exception
{
	AgeException(String str)
	{
		super(str);	
	}
}

class Exercise1
{
	public static String validateAge(int age) throws AgeException
	{
		if(age<15)
		 throw new AgeException("Age is below 15");
		else
			return "Age is above 15";	
	}
	public static void main(String[] args)
	{
		int age=17;
		try
		{
			String result=validateAge(14);
			System.out.println(result);

		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}	
	}
}