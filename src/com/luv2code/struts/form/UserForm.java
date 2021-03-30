package com.luv2code.struts.form;

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm{
	
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "UserForm [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	

}
