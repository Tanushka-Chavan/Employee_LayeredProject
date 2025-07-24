package com.tka.service;

import java.util.List;

import com.tka.dao.EmployeeDao;
import com.tka.entity.Employee;

public class EmployeeService {

	public String insertemployee(Employee e1) {
		
		EmployeeDao d1=new EmployeeDao();
		boolean check=d1.insertemployee(e1);
		if(check)
		{
			return "Record inserted succesfully";
		}else
		{
			return "Record not inserted";
		}
	}

	public List<String > getsalrymorethan20(Employee e1) {
		EmployeeDao d1=new EmployeeDao();
		 return d1.getsalrymorethan20(e1);
		
	}

	public List<Employee> getrecordofemphavingsalary20k(Employee e1) {
		EmployeeDao dd=new EmployeeDao();
		return dd.getrecordofemphavingsalary20k(e1);
		
	}

	public List<Employee> getnameandexpwhereagegreaterthan35(Employee e1) {
		EmployeeDao df=new EmployeeDao();
		return df.getnameandexpwhereagegreaterthan35(e1);
		
	}

	public List<String>  devprofile(Employee e1) {
		EmployeeDao dm=new EmployeeDao();
		return dm.devprofile(e1);
		
	}

	public List<String> profiletest(Employee e1) {
		EmployeeDao cd=new EmployeeDao();
		return cd.profiletest(e1);
		
	}

	public List<Employee> empsalrymorethan25k(Employee e1) {
		EmployeeDao cd=new EmployeeDao();
		return cd.empsalrymorethan25k(e1);
		
	}

	public List<Employee>  getsalrynoteqt51k(Employee e1) {
		EmployeeDao cd=new EmployeeDao();
		return cd.getsalrynoteqt51k(e1);
	}

	public List<Employee> expln20(Employee e1) {
		EmployeeDao cd=new EmployeeDao();
		return cd. expln20(e1);
		
		
	}

	public List<Employee> removeempwithexp21yr(Employee e1) {
		EmployeeDao cd=new EmployeeDao();
		return cd.removeempwithexp21yr(e1);
		
	}

	public List<Employee> decreasesalryby21k(Employee e1) {
		EmployeeDao cd=new EmployeeDao();
		return cd.decreasesalryby21k(e1);
		
	}

}
