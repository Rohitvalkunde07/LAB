class VotingException extends Exception
{
	public VotingException(String msg)
	{
		super(msg);
	}
}

class VoteEligibilityTracker
{
	private String status; 
	public void setStatus(String status)
	{
		this.status=status;
	}
	public String getStatus()
	{
		return status;
	}
}
class VoteMachine
{
	public String validateAgeToVote(VoteEligibilityTracker tracker,int age) throws VotingException
	{
		String status="";
		try
		{
			if(age<18) 
			{
				 status="Not Eligible to Vote";
				 throw new VotingException("Not Eligible to Vote");
				
			}
			else
			{
				status="Eligible to vote";
				tracker.setStatus(status);
				return status;
			}
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		tracker.setStatus(status);
	 	return status;
	}
	public String validateAgeToVote(VoteEligibilityTracker tracker,String age) throws VotingException
	{
		String status="";
		int len=age.length();
		try
		{
			int age1=Integer.parseInt(age);
			if(len>2 ||age1<18)
			{
				status="Not Eligible to Vote";
				throw new VotingException("Not Eligible to Vote");
			}
			else
			{
				status="Eligible to Vote";	
			}
			 
		}
		 
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		tracker.setStatus(status);
	 	return status;
	}
}
class ExceptionHandling1
{
	public static void main(String[] args)
	{
		VoteEligibilityTracker tracker=null;
		  tracker=new VoteEligibilityTracker();
		VoteMachine m1=new VoteMachine();
		try
		{
			System.out.println("----------------Integer Form------------");
			String result=m1.validateAgeToVote(tracker,18);
			System.out.println("Status:-"+result);
			System.out.println("----------------String Form------------");
			String result1=m1.validateAgeToVote(tracker,"161");
			System.out.println("Status:-"+result1);
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	}	

}