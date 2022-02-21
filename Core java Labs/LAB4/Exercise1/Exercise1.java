import java.lang.Math;
import java.util.Random;
class Person
{
	private String name;
	private float age;

	public Person(String name,float age)
	{
		this.name=name;
		this.age=age;	
	}
	public String getName()
	{
		return name;
	}
	public float getAge()
	{
		return age;	
	}
}
class Account
{
	private long accNum;
	private double balance;
	private Person accHolder;
	
	Account(long accNum,double balance,Person accHolder)
	{
		this.accNum=accNum;
		this.balance=balance;
		this.accHolder=accHolder;
	}

	public long getAccNum()
	{
		return accNum;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double bal)
	{
		balance=bal;	
	}
	public Person getAccHolder()
	{
		return accHolder;
	}

	public double deposit(double bal)
	{
		balance=balance+bal;
		return balance;	
	}
	public double withdraw(double bal)
	{
		balance=balance-bal;
		return balance;	
	}
	
}
class SavingAccount extends Account
{
	final double minimumBalance=500;
	SavingAccount(long accNum,double balance,Person accHolder)
	{
		super(accNum,balance,accHolder);
		
	}
	@Override
	public double withdraw(double bal)
	{
		if(getBalance()-bal<=minimumBalance)
		{
			 System.out.println("Low Balance Cannot Withdraw!");
			double balance=getBalance();
			return balance;
		}
		else
		{
			double balance=getBalance()-bal;
			setBalance(balance);
			return balance;	
		}	
	}
}
class CurrentAccount extends Account
{
	final double minimumBalance=500;
	CurrentAccount(long accNum,double balance,Person accHolder)
	{
		super(accNum,balance,accHolder);
	}
	public double withdraw(double bal)
	{
		 
		if(getBalance()-bal<=minimumBalance)
		{
			 System.out.println("OverDraft Limit is Reached!");
			double balance=getBalance();
			return balance;
		}
		else
		{
			double balance=getBalance()-bal;
			setBalance(balance);
			return balance;	
		}	
	}
}
public class Exercise1
{
	public static void main(String[] args)
	{
		Random r=new Random();
		long accNum1=r.nextLong()*-1;
		long accNum2=r.nextLong()*-1;
		 
		Person p1=new Person("Smith",22);
		Person p2=new Person("Kathy",23);
		SavingAccount acc1=new SavingAccount(accNum1,2000,p1);
		CurrentAccount acc2=new CurrentAccount(accNum2,3000,p2);
		
		System.out.println("Initial Account Setup:-");
		
		Person person1=acc1.getAccHolder();
		System.out.println("Account Number:-"+acc1.getAccNum());
		System.out.println("Account Holder Name:-"+person1.getName());
		System.out.println("Account Balance:-"+acc1.getBalance());
		System.out.println();

		Person person2=acc2.getAccHolder();
		System.out.println("Account Number:-"+acc2.getAccNum());
		System.out.println("Account Holder Name:-"+person2.getName());
		System.out.println("Account Balance:-"+acc2.getBalance());	

		acc1.deposit(2000);
		acc2.withdraw(1000);
		System.out.println();
		System.out.println("Values After Transaction:-");
		System.out.println("Account Number:-"+acc1.getAccNum());
		System.out.println("Account Holder Name:-"+p1.getName());
		System.out.println("Account Balance:-"+acc1.getBalance());
		System.out.println();
		System.out.println("Account Number:-"+acc2.getAccNum());
		System.out.println("Account Holder Name:-"+person2.getName());
		System.out.println("Account Balance:-"+acc2.getBalance());	
		
	}
}