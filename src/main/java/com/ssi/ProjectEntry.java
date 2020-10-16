package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjectEntry {
	public static void main(String[] args) {
		
		Project p1=new Project("P1","ERP-System","ICICI");
		Project p2=new Project("P2","FileWall","Intel");
		Project p3=new Project("P3","ECommerce","Amazon");
		
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(p1); session.save(p2); session.save(p3);
		tr.commit();
		session.close();
		System.out.println("Laptop Information Stored....................!!");
	}
}
