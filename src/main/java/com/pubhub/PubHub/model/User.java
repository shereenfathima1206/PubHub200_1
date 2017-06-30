package com.pubhub.PubHub.model;

import javax.persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "users")

public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "NAME")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "PASSWORD")
	private String password;
	private boolean active;
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	}
	
	



