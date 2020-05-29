package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String first_name;
	private String last_name;
	private double mobile;
	private String email;
	private String location_type;
	private String location_string;
	private boolean status;
	private String communication;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public double getMobile() {
		return mobile;
	}
	public void setMobile(double mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation_type() {
		return location_type;
	}
	public void setLocation_type(String location_type) {
		this.location_type = location_type;
	}
	public String getLocation_string() {
		return location_string;
	}
	public void setLocation_string(String location_string) {
		this.location_string = location_string;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getCommunication() {
		return communication;
	}
	public void setCommunication(String communication) {
		this.communication = communication;
	}
	

}