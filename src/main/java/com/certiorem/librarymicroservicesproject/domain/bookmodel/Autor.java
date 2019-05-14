package com.certiorem.librarymicroservicesproject.domain.bookmodel;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "Autor")
@Data
public class Autor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AUTOR_ID")
	private Integer id;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "SURNAME", nullable = false)
	private String surname;
	
	@Column(name = "YEAR_OF_BIRTH")
	private Integer yearOfBirth;
	
	@Column(name = "DEATH_YEAR")
	private Integer deathYear;
	
	@Column(name = "NATIONALITY")
	private String nationality;
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "autors")
	private List<Book> writtenBooks;

}
