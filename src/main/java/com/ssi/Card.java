package com.ssi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Card {
	@Id
	private String cno;
	private String ctype;
	@Column(name="climit")
	private int limit;

	@ManyToOne
	private Account account;
	
	public Card() {
		super();
	}
	
	public Card(String cno) {
		super();
		this.cno = cno;
	}

	public Card(String cno, String ctype, int limit) {
		super();
		this.cno = cno;
		this.ctype = ctype;
		this.limit = limit;
	}
	
	public Card(String cno, String ctype, int limit, Account account) {
		super();
		this.cno = cno;
		this.ctype = ctype;
		this.limit = limit;
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "Card [cno=" + cno + ", ctype=" + ctype + ", limit=" + limit + "]";
	}
	
	
	
	
}
