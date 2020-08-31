package com.newapp.s2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employzz {
	
	int id;
	
	String firstName;
	String emailId;
	
	public Employzz()
	{
		
	}
	public Employzz(int id, String firstName, String emailId) {
		// TODO Auto-generated constructor stub
		this.emailId = emailId;
		this.id = id;
		this.firstName = firstName;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int getId() {
		return id;
	}

		
	private void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "firstName", nullable = false)
	private String getNameString() {
		return firstName;
	}

	
	private void setNameString(String nameString) {
		this.firstName = nameString;
	}

	@Column(name = "emailId", nullable = false)
	private String getEmail() {
		return emailId;
	}

	@Override
	public String toString() {
		return "Employzz [id=" + id + ", firstName=" + firstName + ", emailId=" + emailId + "]";
	}

	private void setEmail(String email) {
		this.emailId = email;
	}
	
	
}
