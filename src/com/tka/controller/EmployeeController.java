package com.tka.controller;

import java.util.List;

import com.tka.entity.Employee;
import com.tka.service.EmployeeService;

public class EmployeeController {

	public String insertemployee(Employee e1) {
		
		EmployeeService sc=new EmployeeService();
		return sc.insertemployee(e1);
		
	}

	public List<String > getsalrymorethan20(Employee e1) {
		EmployeeService ds=new EmployeeService();
		 return ds.getsalrymorethan20(e1);
	}

	public List<Employee> getrecordofemphavingsalary20k(Employee e1) {
		EmployeeService fc=new EmployeeService();
	return 	fc.getrecordofemphavingsalary20k(e1);
		
	}

	public List<Employee> getnameandexpwhereagegreaterthan35(Employee e1) {
		EmployeeService ss=new EmployeeService();
		return ss.getnameandexpwhereagegreaterthan35(e1);
	}

	public List<String>  devprofile(Employee e1) {
		EmployeeService sf=new EmployeeService();
		return sf.devprofile(e1);
		
	}

	public List<String> profiletest(Employee e1) {
		EmployeeService ec=new EmployeeService(); 
		return ec.profiletest(e1);
		
	}

	public List<Employee> empsalrymorethan25k(Employee e1) {
		EmployeeService ec=new EmployeeService(); 
		return ec.empsalrymorethan25k(e1);
	}

	public List<Employee> getsalrynoteqt51k(Employee e1) {
		EmployeeService ec=new EmployeeService();
		return ec.getsalrynoteqt51k(e1);
		
	}

	public List<Employee> expln20(Employee e1) {
		EmployeeService ec=new EmployeeService();
		return ec.expln20(e1);
		
	}

	public List<Employee> removeempwithexp21yr(Employee e1) {
		EmployeeService ec=new EmployeeService();
		return ec.removeempwithexp21yr(e1);
		
	}

	public List<Employee> decreasesalryby21k(Employee e1) {
		EmployeeService ec=new EmployeeService();
		return ec.decreasesalryby21k(e1);
		
	}

}
