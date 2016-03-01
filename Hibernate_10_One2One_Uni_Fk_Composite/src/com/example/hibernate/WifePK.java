package com.example.hibernate;

import java.io.Serializable;

public class WifePK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 280882056692876298L;
	
	private int id;
	private String name;
	
	
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
	
}
