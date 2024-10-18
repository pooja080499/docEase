package com.docEase.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Chat")
public class Chat {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	public Chat() {
		super();
	}
	public Chat(int id, int appointment_id, String messages) {
		super();
		this.id = id;
		this.appointment_id = appointment_id;
		this.messages = messages;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAppointment_id() {
		return appointment_id;
	}
	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}
	public String getMessages() {
		return messages;
	}
	public void setMessages(String messages) {
		this.messages = messages;
	}
	private int appointment_id;
	
	@Column(length=1000)
	private String messages;

}
