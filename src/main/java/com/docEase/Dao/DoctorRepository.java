package com.docEase.Dao;

import org.springframework.data.repository.CrudRepository;

import com.docEase.entities.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor,Integer> {

}
