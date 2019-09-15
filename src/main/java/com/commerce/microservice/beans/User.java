package com.commerce.microservice.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.commerce.microservice.utils.InheritColumns;

@Entity
@Table(name="user")
public class User extends InheritColumns implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String login;
	private String password;
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}	

}
