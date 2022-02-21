import java.util.*;

class Exercise6
{
  public static int calculateDiffrence(int n)
  {
    int a=1;
    int sq=0;
    int add=0;
        while(a<=n)
	{
	  sq=sq+a*a;
	  add=add+a;
	   a++;
	}
	  add=add*add;
	return add-sq;
  }

  public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);

      int n=sc.nextInt();

      int ref=calculateDiffrence(n);

      System.out.println("Difference is:" + ref);
    }
}