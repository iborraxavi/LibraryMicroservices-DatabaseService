package com.certiorem.librarymicroservicesproject.model.orderbook;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "Client")
@Data
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "DNI", nullable = false)
	private String dni;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@JsonIgnore
	@OneToMany(mappedBy="client")
	private List<Order> orders;

}
