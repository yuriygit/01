package com.yuriyb.petproject01.domain; 

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "Login", length = 15, nullable = false)
	private String login;
	
	@Column(name = "Name", length = 100, nullable = false)
	private String name;
	
	@ManyToOne(cascade={CascadeType.REFRESH})
	@JoinColumn(name="IdRole")
	private Role role;
	
	@Column(name = "Pass", length = 15, nullable = false)
	private String pass;
	
	@Column(name = "Active", nullable = false) 
	private Boolean active;
	
	// Getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}

