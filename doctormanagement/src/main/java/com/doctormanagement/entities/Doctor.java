package com.doctormanagement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Doctor {
	@Id
	@GeneratedValue
	private int did;
	
	private String dname;
	private String specialization;
	
	
	
	
	

}
