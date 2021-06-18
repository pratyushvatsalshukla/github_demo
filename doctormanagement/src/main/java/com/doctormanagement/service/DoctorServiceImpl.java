package com.doctormanagement.service;

import java.util.List;

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



	@Override
	public Doctor getDoctor(int id) {

		Doctor d=repo.getById(id);
		
		
		return d;
	}

	

	public List<Doctor> getAllDoctor() {
		
		List<Doctor> list=repo.findAll();
		
		return list;
	}



	public void deleteDoctor(Integer id) {

	  repo.deleteById(id);
		
	
	}

}
