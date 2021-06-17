package com.doctormanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctormanagement.entities.Doctor;
import com.doctormanagement.repository.DoctorRepo;

@Service
public class DoctorServiceImpl implements DoctorSevice {

	@Autowired
	DoctorRepo repo;
	
	
	
	@Override
	public int insertDoctor(Doctor doct) {
		// TODO Auto-generated method stub
		int i=0;
		Doctor d=repo.save(doct);
		if(d!=null) {
			i=d.getDid();
			//i=1;
		}
		return i;
	}

}
