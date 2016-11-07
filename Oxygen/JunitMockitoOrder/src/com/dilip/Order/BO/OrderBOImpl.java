package com.dilip.Order.BO;

import java.sql.SQLException;

import com.dilip.Order.BO.Exception.BOException;
import com.dilip.Order.Dao.Order;
import com.dilip.Order.Dto.OrderDao;

public class OrderBOImpl implements OrderBO {

	OrderDao dao;
	public OrderDao getDao() {
		return dao;
	}

	public void setDao(OrderDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean placeOrder(Order order) throws BOException {
		try {
			int result = dao.create(order);
			
			if(result==0)
			{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new BOException(e);
		}
		return false;
	}

	@Override
	public boolean cancelOrder(int id) throws BOException {
		try {
			Order order = dao.read(id);
			order.setStatus("cancelled");
			int result=dao.update(order);
			if(result==0)
				return false;
			
			dao.update(order);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteOrder(int id) throws BOException {
		try {
			int result=dao.delete(id);
			if(result==0)
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
