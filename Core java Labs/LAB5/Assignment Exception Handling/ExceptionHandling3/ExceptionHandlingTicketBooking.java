import java.time.LocalDate;
class TravelDateException extends Exception
{
	TravelDateException(String msg)
	{
		super(msg);
	}
}
class NegativeValueException extends Exception
{
	NegativeValueException(String msg)
	{
		super(msg);
	}
}




class TicketBooking
{
	private String passengerName;
	private LocalDate travelDate;
	private int noOfTickets;
	private double eachTicketAmount;

	TicketBooking(String passengerName,LocalDate travelDate,int noOfTickets,double eachTicketAmount)
	{
		 this.passengerName=passengerName;
	 	 this.travelDate=travelDate;
	 	 this.noOfTickets=noOfTickets;
	 	 this.eachTicketAmount=eachTicketAmount;
	}
	public String getPassengerName()
	{
		return passengerName;
	}
	public LocalDate getTravelDate()
	{
		return travelDate;
	}
	public int getNoOfTickets()
	{
		return noOfTickets;
	}
	public double getEachTicketAmount()
	{
		return eachTicketAmount;
	}
}
class BookingImp1
{
	public String validate(TicketBooking tbk) throws TravelDateException,NegativeValueException
	{
		String status="";
		if(tbk.getTravelDate().equals(LocalDate.now()))
		{
			throw new TravelDateException("Date is Earlier than currentDate");
		}
		if(tbk.getNoOfTickets()<0)
		{
			throw new NegativeValueException("No of tickets Cannot be negative");	
		}
		 else
		{
			status="Sucessfully Validated";
		}
		return status;	
	}
	public double computeBillAmount(TicketBooking tbk)
	{
		double total=0;	
		try
		{
			validate(tbk);
			total=tbk.getNoOfTickets()*tbk.getEachTicketAmount();
		}
		catch(TravelDateException e)
		{
			total=0;
			e.printStackTrace();
		}
		catch(NegativeValueException e)
		{
			total=-1;
			e.printStackTrace();
		}
		return total;
	}	
}
class ExceptionHandlingTicketBooking
{
	public static void main(String[] args)
	{
		TicketBooking b1=new TicketBooking("Rohit",LocalDate.of(2022,03,04),4,1000);
		BookingImp1 i1=new BookingImp1();
		double result=i1.computeBillAmount(b1);
		System.out.println("Total amount tompay is "+result);
	}

}