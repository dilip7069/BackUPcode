package com.dilip.Order.Dto;

import java.sql.SQLException;

import com.dilip.Order.Dao.Order;

public interface OrderDao {

	int create(Order order) throws SQLException;
	Order read(int id) throws SQLException;
	int update(Order order) throws SQLException;
	int delete(int id) throws SQLException;
}
