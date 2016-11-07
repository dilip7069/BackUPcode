package spring.controller;

public class Country { 
	
	int id;
	String CountryName;
	
	public Country(int id, String CountryName){
		this.id = id;
		this.CountryName = CountryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return CountryName;
	}

	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	
	

}
