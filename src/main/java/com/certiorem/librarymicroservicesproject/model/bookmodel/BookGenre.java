package com.certiorem.librarymicroservicesproject.model.bookmodel;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "BookGenre")
@Data
public class BookGenre implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="bookGenre")
	private List<Book> books;
	
}
