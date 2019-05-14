package com.certiorem.librarymicroservicesproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.certiorem.librarymicroservicesproject.domain.purchasebook.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
	
	List<Purchase> findByProviderId(Integer providerId);

}
