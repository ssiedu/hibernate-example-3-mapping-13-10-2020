package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CardEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Card c1=new Card("C1","PL-D-C",150000, new Account(1111));
		Card c2=new Card("C2","PL-C-C",50000, new Account(1111));
		Card c3=new Card("C3","GL-D-C",20000, new Account(1111));
		Card c4=new Card("C4","GL-C-C",150000, new Account(2222));
		Card c5=new Card("C5","SL-D-C",350000, new Account(2222));
		Card c6=new Card("C6","SL-D-C",250000, new Account(2222));
		
		Session session=Utility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(c1); session.save(c2); session.save(c3); session.save(c4); session.save(c5); session.save(c6);
		tr.commit();
		session.close();
		System.out.println("Card Information Stored....................!!");
	}

}
