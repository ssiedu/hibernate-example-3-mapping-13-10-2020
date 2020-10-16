package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchProject {
public static void main(String[] args) {
		
		Session session=Utility.getSF().openSession();
		Project project=session.get(Project.class, "P3");
		System.out.println(project.getPcode());
		System.out.println(project.getTitle());
		System.out.println(project.getClient());
		System.out.println("Employees Working On This Project...................:");
		List<Emp> emps=project.getEmps();
		for(Emp emp:emps) {
			System.out.println(emp.getEcode());
			System.out.println(emp.getEname());
			System.out.println("____________________");
		}
		session.close();

	}
}
