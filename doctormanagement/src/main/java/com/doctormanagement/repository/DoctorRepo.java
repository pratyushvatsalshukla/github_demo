package com.doctormanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doctormanagement.entities.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
		
	
	
	
}
