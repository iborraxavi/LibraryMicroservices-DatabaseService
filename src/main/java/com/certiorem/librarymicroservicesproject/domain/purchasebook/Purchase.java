package com.certiorem.librarymicroservicesproject.domain.purchasebook;

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

import com.certiorem.librarymicroservicesproject.domain.bookmodel.Book;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "Purchase")
@Data
public class Purchase implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PURCHASE_ID")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "PROVIDER", nullable = false)
	private Provider provider;

	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "purchase_book", joinColumns = {
			@JoinColumn(name = "PURCHASE_ID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "BOOK_ID", nullable = false, updatable = false) })
	private List<Book> books;
	
	@Column(name = "TOTAL_PRICE")
	private double totalPrice;
	
}
