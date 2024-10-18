package com.docEase.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	public Patient() {
		super();
	}
	public Patient(int id, String medical_history, String appointment_id) {
		super();
		this.id = id;
		this.medical_history = medical_history;
		Appointment_id = appointment_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMedical_history() {
		return medical_history;
	}
	public void setMedical_history(String medical_history) {
		this.medical_history = medical_history;
	}
	public String getAppointment_id() {
		return Appointment_id;
	}
	public void setAppointment_id(String appointment_id) {
		Appointment_id = appointment_id;
	}
	private String medical_history;
	private String Appointment_id;
	
	

}
