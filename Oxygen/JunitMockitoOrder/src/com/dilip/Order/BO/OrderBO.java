package com.dilip.Order.BO;

import com.dilip.Order.BO.Exception.BOException;
import com.dilip.Order.Dao.Order;

public interface OrderBO {

	boolean placeOrder(Order order) throws BOException;
	boolean cancelOrder(int id) throws BOException;
	boolean deleteOrder(int id) throws BOException;
	
}
