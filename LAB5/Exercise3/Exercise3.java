class EmployeeException extends Exception
{
	EmployeeException(String str)
	{
		super(str);
	}
}

public class Exercise3
{
	public static String validate(int sal) throws EmployeeException
	{
		if(sal<3000)
                       {
			throw new EmployeeException("Salary is less than 3000");
                        }
		else
			return " Salary is greater than 3000";
	}
	public static void main(String[] args)
	{
		int salary=4000;
		try
		{
			String result=validate(salary);
			System.out.println(result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}