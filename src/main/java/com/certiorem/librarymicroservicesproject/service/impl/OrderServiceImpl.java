package com.certiorem.librarymicroservicesproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certiorem.librarymicroservicesproject.domain.orderbook.Order;
import com.certiorem.librarymicroservicesproject.repository.OrderRepository;
import com.certiorem.librarymicroservicesproject.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order createUpdateOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public Order getOrder(Integer id) {
		return orderRepository.getOne(id);
	}

	@Override
	public void deleteOrder(Integer id) {
		orderRepository.deleteById(id);
	}

	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public List<Order> getOrdersByClientId(Integer clientId) {
		return orderRepository.findByClientId(clientId);
	}
	
}
