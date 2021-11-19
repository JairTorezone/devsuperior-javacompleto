package com.devsuperior.m13.enuComposicao.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date date;
	
	public Client() {
	}

	public Client(String name, String email, Date date) {
		this.name = name;
		this.email = email;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Client: " + getName() + " " + "("+ sdf1.format(getDate()) +")" + " - " + getEmail() +"\n");

		return sb.toString();
	}
	
	
}
