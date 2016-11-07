package com.dev.laptopmanf.dao;
import com.dev.laptopmanf.model.ChipManf;

public interface LaptopDao {
	public boolean testValidate(String uname,String pwd);
	public void addManf(ChipManf c);

}
