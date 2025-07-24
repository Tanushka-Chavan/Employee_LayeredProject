package com.tka.frontened;

import java.util.List;

import com.tka.controller.EmployeeController;
import com.tka.entity.Employee;

public class User {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
	
		EmployeeController ep=new EmployeeController();
		String ms=ep.insertemployee(e1);
		System.out.println(ms);
		
		List<String > a=ep.getsalrymorethan20(e1);
		System.out.println(a);
		
		List<Employee> b=ep.getrecordofemphavingsalary20k(e1);
		System.out.println(b);
		
		
		List<Employee> c=ep.getnameandexpwhereagegreaterthan35(e1);
		System.out.println(c);
		
		List<String> d=ep.devprofile(e1);
		System.out.println(d);
		
		List<String> e=ep.profiletest(e1);
		System.out.println(e);
		
		List<Employee> f=ep.empsalrymorethan25k(e1);
		System.out.println(f);
		
		List<Employee> g=ep.getsalrynoteqt51k(e1);
		System.out.println(g);
		
		List<Employee> h=ep.expln20(e1);
		System.out.println(h);
		
		List<Employee> i=ep.removeempwithexp21yr(e1);
		System.out.println(i);
		
		List<Employee> j=ep.decreasesalryby21k(e1);
		System.out.println(j);
	}

}
