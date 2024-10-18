package com.docEase.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	public User() {
		super();
	}
	public User(int id, String name, String contact, String gender, String date_of_birth, String address,
			String country, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
		Address = address;
		this.country = country;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + ", gender=" + gender + ", date_of_birth="
				+ date_of_birth + ", Address=" + Address + ", country=" + country + ", email=" + email + ", password="
				+ password + ", role=" + role + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	private String name;
	private String contact;
	private String gender;
	private String date_of_birth;
	private String Address;
	private String country;
	private String email;
	private String password;
	
	private String role;
	public User( String name, String contact, String gender, String date_of_birth, String address,
			String country, String email, String password, String role) {
		super();
		this.name = name;
		this.contact = contact;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
		this.Address = address;
		this.country = country;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
	

}
