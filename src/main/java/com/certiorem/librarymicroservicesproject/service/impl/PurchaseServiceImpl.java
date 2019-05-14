package com.certiorem.librarymicroservicesproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certiorem.librarymicroservicesproject.domain.purchasebook.Purchase;
import com.certiorem.librarymicroservicesproject.repository.PurchaseRepository;
import com.certiorem.librarymicroservicesproject.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	private PurchaseRepository purchaseRepository;
	
	@Override
	public Purchase createUpdatePurchase(Purchase purchase) {
		return purchaseRepository.save(purchase);
	}

	@Override
	public Purchase getPurchase(Integer id) {
		return purchaseRepository.getOne(id);
	}

	@Override
	public void deletePurchase(Integer id) {
		purchaseRepository.deleteById(id);
	}

	@Override
	public List<Purchase> getAllPurchases() {
		return purchaseRepository.findAll();
	}

	@Override
	public List<Purchase> getPurchasesByProviderId(Integer providerId) {
		return purchaseRepository.findByProviderId(providerId);
	}

}
