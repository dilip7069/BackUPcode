package com.dev.laptopmanf.service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.laptopmanf.dao.LaptopDao;
import com.dev.laptopmanf.model.ChipManf;

public class LoginValidationImplementation implements LoginValidation {
	
	private LaptopDao lpdao;
	public void setLpdao(LaptopDao lpdao) {
		this.lpdao = lpdao;
	}
	public boolean authenticateuser(String uname,String pwd){
		System.out.println("Hello from Login Validator");
		
		return lpdao.testValidate(uname, pwd);
	};
	@Transactional
	public void addManf(ChipManf c)
	{
		System.out.println("add Manf from DBOP");

		lpdao.addManf(c);
	}

}
