package com.certiorem.librarymicroservicesproject.domain.purchasebook;

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
@Table(name = "Provider")
@Data
public class Provider implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "CIF", nullable = false)
	private String cif;

	@Column(name = "LOCATION")
	private String location;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "provider")
	private List<Purchase> purchases;

}
