package com.tka.frontened;

import java.util.List;
import java.util.Scanner;

import com.tka.controller.EmployeeController;
import com.tka.entity.Employee;

public class User {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Scanner sc=new Scanner(System.in);
		EmployeeController ep=new EmployeeController();
		System.out.println("Menu driven employee table");
		int choice;
		do
		{
			System.out.println("\nChoose an operation to perform");
			System.out.println("1. Inserting an employee in the table");
			System.out.println("2. Get the names of employee having salry greater than 20k ");
			System.out.println("3. Get information about employee who has salry 51k");
			System.out.println("4. Get the name and experience who has afe more than 35");
			System.out.println("5. Get the employee who belongs to devprofile ");
			System.out.println("6. Get the names of employee belonging to testprofile");
			System.out.println("7. Get employee who has salary 25k or more than 25k ");
			System.out.println("8. Get the name and email of employee who don't have 51k");
			System.out.println("9. Update the salry of employee by 10k whose experience less than 20yrs ");
			System.out.println("10.Remove record having 21yrs of experience");
			System.out.println("11.Decrease the salry of john by 21k as compony performs cost cutting");
		
			choice=sc.nextInt();
			switch(choice)
			{
			case 1 :
				String ms=ep.insertemployee(e1);
			    System.out.println(ms);
			    break;
			case 2:
				List<String > a=ep.getsalrymorethan20(e1);
				System.out.println(a);
				break;
			case 3:
				List<Employee> b=ep.getrecordofemphavingsalary20k(e1);
				System.out.println(b);
				break;
			case 4:
				List<Employee> c=ep.getnameandexpwhereagegreaterthan35(e1);
				System.out.println(c);
				break;
			case 5:
				List<String> d=ep.devprofile(e1);
				System.out.println(d);
				break;
			case 6:
				List<String> e=ep.profiletest(e1);
				System.out.println(e);
				break;
			case 7:
				List<Employee> f=ep.empsalrymorethan25k(e1);
				System.out.println(f);
				break;
			case 8:
				List<Employee> g=ep.getsalrynoteqt51k(e1);
				System.out.println(g);
				break;
			case 9:
				List<Employee> h=ep.expln20(e1);
				System.out.println(h);
				break;
			case 10:
				List<Employee> i=ep.removeempwithexp21yr(e1);
				System.out.println(i);
				break;
			case 11:
				List<Employee> j=ep.decreasesalryby21k(e1);
				System.out.println(j);
				break;
			case 0:
				System.out.println("Exit the application");
				break;
			default:
				System.out.println("Invalid Choice");
				break;		
			}	
		}while(choice !=0);
		sc.close();
	}
}
		
		
		
		

		
		
		
		
		
		
		
		
		
