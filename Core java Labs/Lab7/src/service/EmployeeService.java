package service;

import Exception.NotFoundException;
import bean.Employee;

public interface EmployeeService 
{
	public String addDetails(int key,Employee emps) throws NotFoundException;
	public void deleteEmpDetails(int key) throws NotFoundException;
	public void sortByInsuranceScheme(String insuranceScheme);

}
