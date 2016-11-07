package com.dilip.Order.BO.Exception;

import java.sql.SQLException;

public class BOException extends Exception {


	private static final long serialVersionUID = 1L;

	public BOException(SQLException e) {
      super(e);
	}

}
