class OverFlowException extends Exception
{
	OverFlowException(String msg)
	{
		super(msg);
	}
}
class Bike
{
	private String bikeName;
	private int tankCapacity;
	
	Bike(String bikeName,int tankCapacity)
	{
		this.bikeName=bikeName;
		this.tankCapacity=tankCapacity;
	}
	
	public void setBikeName(String bikeName)
	{
		this.bikeName=bikeName;	
	}

	public void setTankCapacity(int tankCapacity)
	{
		this.tankCapacity=tankCapacity;	
	}

	public String getBikeName()
	{
		return bikeName;
	}

	public int getTankCapacity()
	{
	 	return tankCapacity;	
	}
	
}
class PetrolFilling
{
	public String fillPetrol(Bike bike,int noOfLitres) throws OverFlowException
	{
		int tankCapacity=bike.getTankCapacity();
		if(noOfLitres<=0 || noOfLitres>tankCapacity)
		{
			throw new OverFlowException("tank capacity overflown");
		}
		else
		{
			return "tank filled succesfully";
		}
	}
}
public class ExceptionHandling2
{
	public static void main(String[] args)
	{
		Bike b1=new Bike("Honda Shine",10);
		Bike b2=new Bike("Tvs Apache",12);

		PetrolFilling p=new PetrolFilling();
		try
		{
		String result1=p.fillPetrol(b1,10);
		System.out.println(result1);
		String result2=p.fillPetrol(b2,14);
		System.out.println(result2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}