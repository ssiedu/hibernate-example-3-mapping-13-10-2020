package com.ssi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AccountEntry {

	public static void main(String[] args) {
		
		
		Account ac1=new Account();		ac1.setAno(1111); ac1.setName("AAA"); ac1.setBalance(6000); 
		Account ac2=new Account();		ac2.setAno(2222); ac2.setName("BBB"); ac2.setBalance(7000); 
		
		
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(ac1); session.save(ac2);
		tr.commit();
		session.close();
		System.out.println("Account Information Stored....................!!");

	}

}
