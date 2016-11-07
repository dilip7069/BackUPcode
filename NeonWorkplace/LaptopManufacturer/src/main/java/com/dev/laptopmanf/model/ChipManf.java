package com.dev.laptopmanf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ChipManf")
public class ChipManf {
	
	
	@Id
	@Column(name="manfname")
	private String manfname;

	private String adress;
	private String street;
	private String city;
	private String state;

	public String getManfname() {
		return manfname;
	}
	public void setManfname(String manfname) {
		this.manfname = manfname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String toString()
	{
		return "manfname="+manfname+", adress="+adress+", state="+state;
	}

}
