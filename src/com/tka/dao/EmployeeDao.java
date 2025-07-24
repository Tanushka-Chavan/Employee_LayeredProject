package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.tka.configuration.Hibernate;
import com.tka.entity.Employee;

public class EmployeeDao {

	public boolean insertemployee(Employee e1) {
		
		SessionFactory factory=Hibernate.gethibernateconfiguration();
		Session session=factory.openSession();
		
		
		session.close();
		return true;
		
	}

	public List<String > getsalrymorethan20(Employee e1) {
		SessionFactory factory=Hibernate.gethibernateconfiguration();
		Session session1=factory.openSession();
		Criteria criteria=session1.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("salary", 20000));
		criteria.setProjection(Projections.property("name"));
		List<String > name=criteria.list();
		for(String empname: name)
		{
			System.out.println("Name of the employee having salry more than 20k are: "+ empname);
		}
		session1.close();
		return name;
		
	}

	public List<Employee> getrecordofemphavingsalary20k(Employee e1) {
		SessionFactory factory=Hibernate.gethibernateconfiguration();
		Session session2=factory.openSession();
		Criteria criteria=session2.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("salary",51000));
		List<Employee> emp=criteria.list();
		for(Employee e2: emp )
		{
			System.out.println("Employee having salary 51000 with their details is");
			System.out.println("Name of the Employee is: "+ e2.getName());
			System.out.println("Age of employee is: "+ e2.getAge());
			System.out.println("Email of the employee is: "+e2.getEmail());
			System.out.println("Experience of the employee is:"+e2.getExperience());
			System.out.println("Profile of the employee is:"+ e2.getProfile());
		}
		session2.close();
		return emp;
	}

	public List<Employee> getnameandexpwhereagegreaterthan35(Employee e1) {
		
		SessionFactory factory=Hibernate.gethibernateconfiguration();
		Session session3=factory.openSession();
		Criteria criteria=session3.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("age", 35));
		List<Employee> emp1=criteria.list();
		for(Employee e5: emp1)
		{
			System.out.println("Name and Experience of emp whose age is greater than 35 are");
			System.out.println("Name of the employee is:"+ e5.getName());
			System.out.println("Experience of the employee is"+ e5.getExperience());
		}
		session3.close();
		return emp1;
		
	}

	public List<String>  devprofile(Employee e1) {
		SessionFactory factory=Hibernate.gethibernateconfiguration();
		Session session4=factory.openSession();
		Criteria criteria=session4.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("profile","dev"));
		criteria.setProjection(Projections.property("name"));
		List<String> emp6=criteria.list();
		for(String s1:emp6)
		{
			System.out.println("Employee having dev profile"+ s1);
		}
		session4.close();
		return emp6;
	}

	public List<String> profiletest(Employee e1) {
		SessionFactory factory=Hibernate.gethibernateconfiguration();
		Session session5=factory.openSession();
		Criteria criteria=session5.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("profile","test"));
		criteria.setProjection(Projections.property("name"));
		List<String> cc=criteria.list();
		for(String g:cc)
		{
			System.out.println("Employee having profile as test"+g);
		}
		session5.close();
		return cc;
		
	}

	public List<Employee> empsalrymorethan25k(Employee e1) {
		SessionFactory factory=Hibernate.gethibernateconfiguration();
		Session session6=factory.openSession();
		Criteria criteria=session6.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("salary", 25000));
		List<Employee> emp7=criteria.list();
		for(Employee r:emp7)
		{
			System.out.println("Records of Employee having salary more than 25k ");
			System.out.println("Name of the Employee is: "+ r.getName());
			System.out.println("Age of employee is: "+ r.getAge());
			System.out.println("Email of the employee is: "+r.getEmail());
			System.out.println("Experience of the employee is:"+r.getExperience());
			System.out.println("Profile of the employee is:"+ r.getProfile());
		}
		session6.close();
		return emp7;
		
	}

	public List<Employee> getsalrynoteqt51k(Employee e1) {
		SessionFactory factory=Hibernate.gethibernateconfiguration();
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.ne("salary",51000));
		List<Employee> s1=criteria.list();
		for(Employee e:s1)
		{
			System.err.println("Details of employee with salary and email not equal to 51k ");
			System.out.println("Name sof the employee are"+e.getName());
			System.out.println("Emails of the employee are"+e.getEmail());
		}
		session.close();
		return s1;
	}

	public List<Employee> expln20(Employee e1) {
		
		SessionFactory factory1=Hibernate.gethibernateconfiguration();
		Session session=factory1.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.le("experience", 20));
		List<Employee> l1=criteria.list();
		for(Employee e9: l1)
		{
			System.out.println("Updating the salary"+e9);
			int currentsalary=e9.getSalary();
			e9.setSalary(currentsalary+10000);
			session.update(e9);
		}
		session.beginTransaction().commit();
		session.close();
		return l1;
	}

	public List<Employee> removeempwithexp21yr(Employee e1) {
		SessionFactory factory2=Hibernate.gethibernateconfiguration();
		Session session=factory2.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("experience", 21));
		List<Employee> e11=criteria.list();
		for(Employee tt:e11)
		{
			System.out.println("Employee with experence of 21yrs"+tt);
			session.delete(tt);
		}
		session.beginTransaction().commit();
		session.close();
		return e11;
		
	}

	public List<Employee> decreasesalryby21k(Employee e1) {
		SessionFactory factory2=Hibernate.gethibernateconfiguration();
		Session session2=factory2.openSession();
		Criteria criteria=session2.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("name","john"));
		List<Employee> s1=criteria.list();
		for(Employee ss:s1)
		{
			System.out.println("Name of the employee is"+ss);
			int current=ss.getSalary();
			ss.setSalary(current-10000);
			session2.update(s1);
		}
		session2.beginTransaction().commit();
		session2.close();
		return s1;
	}
	
	
	
	

	
	
	
	
	

}
