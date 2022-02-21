package main;
import Exception.NotFoundException;
import bean.Employee;
import service.EmployeeServiceInterface;

public class Main 
{
	public static void main(String[] args) 
	{ 
		 EmployeeServiceInterface empService=new EmployeeServiceInterface();
		 Employee emp1=new Employee(2,"bhim",35000,null,null);
		 Employee emp2=new Employee(12,"ajay",20000,null,null);
		 Employee emp3=new Employee(1,"raj",25000,null,null);
		 Employee emp4=new Employee(10,"akshay",20000,null,null);
		 Employee emp5=new Employee(5,"ajay",20500,null,null);
		
		 try {
			empService.addDetails(1, emp1);
			empService.addDetails(2, emp2);
			empService.addDetails(3, emp3);
			empService.addDetails(4, emp4);
			empService.addDetails(5, emp5);
		} catch (NotFoundException e) {
		
			e.printStackTrace();
		}
		  
		empService.printDetails();
	
	}
}
