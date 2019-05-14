package com.certiorem.librarymicroservicesproject.service;

import java.util.List;

import com.certiorem.librarymicroservicesproject.domain.purchasebook.Purchase;

public interface PurchaseService {

	public Purchase createUpdatePurchase(Purchase purchase);
	
	public Purchase getPurchase(Integer id);
	
	public void deletePurchase(Integer id);
	
	public List<Purchase> getAllPurchases();
	
	public List<Purchase> getPurchasesByProviderId(Integer providerId);
	
}
