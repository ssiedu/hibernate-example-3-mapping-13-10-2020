package com.ssi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {
	@Id
	private int ano;
	private String name;
	private int balance;
	
	@OneToMany(mappedBy="account")
	private List<Card> cards;
	
	public Account() {
		super();
	}
	
	public Account(int ano) {
		super();
		this.ano = ano;
	}

	public Account(int ano, String name, int balance, List<Card> cards) {
		super();
		this.ano = ano;
		this.name = name;
		this.balance = balance;
		this.cards = cards;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", name=" + name + ", balance=" + balance + ", cards=" + cards + "]";
	}
	
	
}
