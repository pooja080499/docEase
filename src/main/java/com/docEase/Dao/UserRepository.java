package com.docEase.Dao;

import org.springframework.data.repository.CrudRepository;

import com.docEase.entities.Patient;

public interface UserRepository extends CrudRepository<Patient,Integer>{


}
