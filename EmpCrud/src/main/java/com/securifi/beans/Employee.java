package com.securifi.beans;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@javax.persistence.Entity
@Table(name="employee")
public class Employee {
	@GeneratedValue
	@Id
	@Column(name="id")
	int id;
	@Column(name="name")
	String name;
	@Column(name="salary")
	float salary;
	@Column(name="designation")
	String designation;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
