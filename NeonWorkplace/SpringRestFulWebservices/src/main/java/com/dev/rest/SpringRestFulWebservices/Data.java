package com.dev.rest.SpringRestFulWebservices;

public class Data {
	
	private String name;
	private int id;
	public Data(Integer id2, String string) {
      this.id=id2;
      this.name=string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
