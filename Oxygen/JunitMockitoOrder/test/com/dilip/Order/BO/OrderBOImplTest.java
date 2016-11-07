package com.dilip.Order.BO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

import com.dilip.Order.BO.Exception.BOException;
import com.dilip.Order.Dao.Order;
import com.dilip.Order.Dto.OrderDao;

public class OrderBOImplTest {
    @Mock
	OrderDao dao;
    @Before
    public void setUp()
    {
    	MockitoAnnotations.initMocks(this);
    }
	@Test
	public void placeOrder_return_orshould_create_An_Order() throws BOException, SQLException {
        OrderBOImpl bo=new OrderBOImpl();
        bo.setDao(dao);
        Order order=new Order();
        while(dao.create(order)).thenReturn(new Integer(1));
        boolean result =bo.placeOrder(order);
        assertTrue(result);
        verify(dao).create(order);
	}


}
