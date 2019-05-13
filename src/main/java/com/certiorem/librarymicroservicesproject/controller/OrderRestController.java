package com.certiorem.librarymicroservicesproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.certiorem.librarymicroservicesproject.model.orderbook.Order;
import com.certiorem.librarymicroservicesproject.modelservice.OrderService;

@RestController
public class OrderRestController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/create-order")
	@ResponseBody
	public Order createOrder(@RequestParam Order order) {
		return orderService.createUpdateOrder(order);
	}
	
	@GetMapping("/read-order")
	@ResponseBody
	public Order getOrderById(@RequestParam String id) {
		return orderService.getOrder(Integer.parseInt(id));
	}
	
	@PostMapping("/update-order")
	@ResponseBody
	public Order updateOrder(@RequestParam Order order) {
		return orderService.createUpdateOrder(order);
	}
	
	@GetMapping("/delete-order")
	@ResponseBody
	public void deleteOrders(@RequestParam String id) {
		orderService.deleteOrder(Integer.parseInt(id));
	}
	
	@GetMapping("/all-orders")
	@ResponseBody
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}
	
	@GetMapping("/orders-by-client")
	@ResponseBody
	public List<Order> getOrdersByClient(@RequestParam String clientId) {
		return orderService.getOrdersByClientId(Integer.parseInt(clientId));
	}
	
}
