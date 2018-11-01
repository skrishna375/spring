package com.study.spring;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {

	@NotEmpty(message = "UserId should not be empty")
	@Size(min = 4, max = 15, message = "UserId should between 4 to 15 char's")
	private String usrId;
	
	@NotEmpty(message = "UserId should not be empty")
	@Size(min = 8, max = 15, message = "UserId should between 4 to 85 char's")
	private String password;
	
	@NotEmpty(message = "Name should not be empty")
	@Size(min = 4, max = 15, message = "Name should between 4 to 15 char's")
	private String name;
	
	@NotEmpty(message = "City should not be empty")
	private String city;
	
	@NotEmpty(message = "E-mail should not be empty")
	@Email
	private String email;
	
	@NotEmpty(message = "UserId should not be empty")
	@Size(min = 10, max = 10, message = "Phone should between 10 digits")
	private String phone;
	
	public String getUsrId() {
		return usrId;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
