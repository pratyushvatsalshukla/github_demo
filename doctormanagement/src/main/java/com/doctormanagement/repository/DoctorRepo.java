package com.doctormanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctormanagement.entities.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
	
	
	
}
