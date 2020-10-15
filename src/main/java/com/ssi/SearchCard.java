package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchCard {

	public static void main(String[] args) {
		Session session=Utility.getSF().openSession();
		Card card=session.get(Card.class, "C5");
		System.out.println("Card Details : ");
		System.out.println(card.getCno());
		System.out.println(card.getCtype());
		System.out.println(card.getLimit());
		System.out.println(card.getAccount().getAno());
		System.out.println(card.getAccount().getName());
		System.out.println(card.getAccount().getBalance());
		session.close();

	}

}
