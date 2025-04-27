package com.authentication.Authenticationspringboot.Modals;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Authmodal {
	private String name;
	private String address;
	private Integer age;
	private Long  Mobilenumber;
	private String email;
	private String password;
	private Authmodal() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Long  getMobilenumber() {
		return Mobilenumber;
	}
	public void setMobilenumber(Long  mobilenumber) {
		Mobilenumber = mobilenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}
