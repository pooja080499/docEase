package com.docEase.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int docid;
	public int getDocid() {
		return docid;
	}
	public void setDocid(int docid) {
		this.docid = docid;
	}
	public Doctor(int docid, String specialization, String year_of_experience, String licence, String clinic_Address) {
		super();
		this.docid = docid;
		this.specialization = specialization;
		this.year_of_experience = year_of_experience;
		this.licence = licence;
		this.clinic_Address = clinic_Address;
	}

	private String specialization;
	private String availability;
	private String year_of_experience;
	private String licence;
	private String clinic_Address;
	private String consulatation_fee;
	
	public Doctor() {
		super();
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", specialization=" + specialization + ", availability=" + availability
				+ ", year_of_experience=" + year_of_experience + ", licence=" + licence + ", clinic_Address="
				+ clinic_Address + ", consulatation_fee=" + consulatation_fee + ", qualification=" + qualification
				+ "]";
	}
	public Doctor(String specialization, String year_of_experience, String licence, String clinic_Address) {
		super();
		this.specialization = specialization;
		this.year_of_experience = year_of_experience;
		this.licence = licence;
		this.clinic_Address = clinic_Address;
	}
	public Doctor(int id, String specialization, String availability) {
		super();
		this.id = id;
		this.specialization = specialization;
		this.availability = availability;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getYear_of_experience() {
		return year_of_experience;
	}
	public void setYear_of_experience(String year_of_experience) {
		this.year_of_experience = year_of_experience;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public String getClinic_Address() {
		return clinic_Address;
	}
	public void setClinic_Address(String clinic_Address) {
		this.clinic_Address = clinic_Address;
	}
	public String getConsulatation_fee() {
		return consulatation_fee;
	}
	public void setConsulatation_fee(String consulatation_fee) {
		this.consulatation_fee = consulatation_fee;
	}
	
	private String qualification;
	public Doctor(int id, String specialization, String availability, String qualification, String year_of_experience,
			String licence, String clinic_Address, String consulatation_fee) {
		super();
		this.id = id;
		this.specialization = specialization;
		this.availability = availability;
		this.qualification = qualification;
		this.year_of_experience = year_of_experience;
		this.licence = licence;
		this.clinic_Address = clinic_Address;
		this.consulatation_fee = consulatation_fee;
	}
	

}
