package com.certiorem.librarymicroservicesproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.certiorem.librarymicroservicesproject.domain.orderbook.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

	List<Order> findByClientId(Integer clientId);
	
}
