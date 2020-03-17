package com.cts;

import java.util.List;

public class FormBean {
	String country;
	List<String>f_hobbies;
	String name;
	String gender;
	public String getName(){
		return name;
	}
	
	public final String getCountry() {
		return country;
	}
	public final void setCountry(String country) {
		this.country = country;
	}
	public final List<String> getF_hobbies() {
		return f_hobbies;
	}
	public final void setF_hobbies(List<String> f_hobbies) {
		this.f_hobbies = f_hobbies;
	}
	public final String getGender() {
		return gender;
	}
	public final void setGender(String gender) {
		this.gender = gender;
	}
	public final void setName(String name) {
		this.name = name;
	}
	

}
