import java.util.*;

class Exercise2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Press 1 for Green");
                System.out.println("Press 2 for Yellow");
                System.out.println("Press 3 for Red");
		

		int choose = sc.nextInt();
	
		switch(choose)
		{
			case 1: System.out.println("Go");
				break;

			case 2: System.out.println("Ready");
				break;

			case 3: System.out.println("Stop");	
				break;
		}
	}
}