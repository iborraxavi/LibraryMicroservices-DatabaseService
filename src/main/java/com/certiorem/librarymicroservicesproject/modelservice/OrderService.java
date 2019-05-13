package com.certiorem.librarymicroservicesproject.modelservice;

import java.util.List;

import com.certiorem.librarymicroservicesproject.model.orderbook.Order;

public interface OrderService {

	public Order createUpdateOrder(Order order);
	
	public Order getOrder(Integer id);
	
	public void deleteOrder(Integer id);
	
	public List<Order> getAllOrders();
	
	public List<Order> getOrdersByClientId(Integer clientId);
	
}
