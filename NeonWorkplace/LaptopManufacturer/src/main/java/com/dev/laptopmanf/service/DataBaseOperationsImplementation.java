package com.dev.laptopmanf.service;

import com.dev.laptopmanf.dao.LaptopDao;
import com.dev.laptopmanf.model.ChipManf;


public class DataBaseOperationsImplementation implements DataBaseOperations {

	private LaptopDao bpdao;
	public void setBpdao(LaptopDao bpdao) {
		this.bpdao = bpdao;
}
	
	public void addManf(ChipManf c)
	{
		System.out.println("add Manf from DBOP");

		bpdao.addManf(c);
	}


	

}
