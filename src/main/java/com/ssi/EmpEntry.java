package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {
		
		Emp e1=new Emp(111, "aaa", 50000, new Laptop("L1"));
		Emp e2=new Emp(112, "bbb", 60000, new Laptop("L2"));
		Emp e3=new Emp(113, "ccc", 70000, new Laptop("L3"));
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2); session.save(e3);
		tr.commit();
		session.close();
		System.out.println("Emp Information Stored....................!!");
	}

}
