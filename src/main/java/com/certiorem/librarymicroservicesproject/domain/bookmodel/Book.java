package com.certiorem.librarymicroservicesproject.domain.bookmodel;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.certiorem.librarymicroservicesproject.domain.orderbook.Order;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "Book")
@Data
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOK_ID")
	private Integer id;

	@Column(name = "TITLE", nullable = false)
	private String title;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "book_autor", joinColumns = {
			@JoinColumn(name = "BOOK_ID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "AUTOR_ID", nullable = false, updatable = false) })
	private List<Autor> autors;

	@Column(name = "YEAR_PUBLICATION")
	private Integer yearPublication;

	@Column(name = "ISBN")
	private String isbn;
	
	@ManyToOne
	@JoinColumn(name = "EDITORIAL_ID")
	private Editorial editorial;
	
	@ManyToOne
	@JoinColumn(name = "GENRE")
	private BookGenre bookGenre;
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "book_order", joinColumns = {
			@JoinColumn(name = "BOOK_ID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "ORDER_ID", nullable = false, updatable = false) })
	private List<Order> orders;
	
	@Column(name = "PURCHASE_PRICE")
	private double purchasePrice;
	
	@Column(name = "ORDER_PRICE")
	private double orderPrice;

}
