package com.docEase.helper;

public class Messege {
	
	private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String type;
	public Messege(String content, String type) {
		super();
		this.content = content;
		this.type = type;
	}
	public Messege() {
		super();
	}
	
	

}
