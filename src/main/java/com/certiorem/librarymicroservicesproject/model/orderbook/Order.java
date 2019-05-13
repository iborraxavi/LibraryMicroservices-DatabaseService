package com.certiorem.librarymicroservicesproject.model.orderbook;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.certiorem.librarymicroservicesproject.model.bookmodel.Book;

import lombok.Data;

@Entity
@Table(name = "orders_list")
@Data
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ORDER_ID")
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENT", nullable = false)
	private Client client;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "orders")
	private List<Book> books;
	
	@Column(name = "TOTAL_PRICE")
	private double totalPrice;
	
}
