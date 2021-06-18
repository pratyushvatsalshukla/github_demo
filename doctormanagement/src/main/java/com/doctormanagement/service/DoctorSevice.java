package com.doctormanagement.service;

import java.util.List;

import com.doctormanagement.entities.Doctor;

public interface DoctorSevice {
	public int insertDoctor(Doctor doct);
	public  Doctor getDoctor(int id);
	public List<Doctor> getAllDoctor();
	public void deleteDoctor(Integer id);
}
