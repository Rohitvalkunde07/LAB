import java.util.*;

class Exercise7
{
   public static boolean checkNumber(int n)
    {
      while(n>0)
         {
	    int digit = n%10;
	    n = n/10;
			
       if(digit < n%10)
	    return false;
	  }
	 
       return true;
     }

   public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
		
	if(checkNumber(n))
         {
	    System.out.println(n+ " is inincrasing order");
	  }
        else
         {
	   System.out.println(n+ " is not in increasing order");
	 } 
     }
}