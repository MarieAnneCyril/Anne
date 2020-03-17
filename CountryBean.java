package com.cts;

public class CountryBean {
	String countryname;
	String climate;
	public CountryBean(String countryname, String climate) {
		super();
		this.countryname = countryname;
		this.climate = climate;
	}
	
	public final String getCountryname() {
		return countryname;
	}
	public final void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public final String getClimate() {
		return climate;
	}
	public final void setClimate(String climate) {
		this.climate = climate;
	}
	

}
