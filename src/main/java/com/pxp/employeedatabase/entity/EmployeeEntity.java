package com.pxp.employeedatabase.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String firstName;
	public String lastName;
	public String mapLocX; // adicionei
	public String mapLocY; // adicionei

	
	public EmployeeEntity() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
	// adicionei get e set para os 2 parametros do Canvas
	public String getMapLocX() {
		return mapLocX;
	}

	public void setMapLocX(String mapLocX) {
		this.mapLocX = mapLocX;
	}

	public String getMapLocY() {
		return mapLocY;
	}

	public void setMapLocY(String mapLocY) {
		this.mapLocY = mapLocY;
	}

	
}
