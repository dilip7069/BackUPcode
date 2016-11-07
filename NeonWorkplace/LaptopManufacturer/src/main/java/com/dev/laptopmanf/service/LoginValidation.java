package com.dev.laptopmanf.service;

import com.dev.laptopmanf.model.ChipManf;

public interface LoginValidation {

	public boolean authenticateuser(String uname,String pwd);
	public void addManf(ChipManf c);
}
