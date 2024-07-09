package com.example.DTO.projection_example;

public class StudentDTO2
{
    int id;
	String email;
	long phn;
	public StudentDTO2(int id, String email, long phn) {
		super();
		this.id = id;
		this.email = email;
		this.phn = phn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhn() {
		return phn;
	}
	public void setPhn(long phn) {
		this.phn = phn;
	}

}
