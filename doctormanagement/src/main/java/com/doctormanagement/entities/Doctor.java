package com.doctormanagement.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@Data
@EntityScan
public class Doctor {
	
	private int did;
	private String dname;
	private String specialization;
	
	
}
