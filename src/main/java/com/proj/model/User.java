package com.proj.model;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="user_name", nullable = false, length = 50, unique = true)
	private String UserName;
	@Column(name="password", nullable = false, length = 50)
    private String password;
	@Column(name="email", nullable = false, unique = true)
    private String email;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(String userName, String password, String email) {
		super();
		UserName = userName;
		this.password = password;
		this.email = email;
	}
	public User() {
		super();
	}
	
}
