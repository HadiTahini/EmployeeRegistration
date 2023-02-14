package com.example.ciblerproject.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "salary")
	private double salary;
	
	@Column(name = "email")
	private String email;
	
	public Employee() {
		
	}
	
	public Employee(String name, double salary, String email) {
		super();
		this.name = name;
		this.salary = salary;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {this.salary = salary;}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
