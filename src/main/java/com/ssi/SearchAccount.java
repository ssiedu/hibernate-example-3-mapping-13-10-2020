package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchAccount {

	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Account account=session.get(Account.class, 1111);
		System.out.println("Account Details : ");
		System.out.println(account.getAno());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		List<Card> cards=account.getCards();
		System.out.println("Cards Given To This Account : ");
		for(Card card:cards) {
			System.out.println(card);
		}
		session.close();

	}

}
