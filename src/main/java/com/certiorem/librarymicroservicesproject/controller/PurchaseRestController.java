package com.certiorem.librarymicroservicesproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.certiorem.librarymicroservicesproject.model.purchasebook.Purchase;
import com.certiorem.librarymicroservicesproject.modelservice.PurchaseService;

@RestController
public class PurchaseRestController {
	
	@Autowired
	private PurchaseService purchaseService;
	
	@PostMapping("/create-purchase")
	@ResponseBody
	public Purchase createPurchase(@RequestParam Purchase purchase) {
		return purchaseService.createUpdatePurchase(purchase);
	}
	
	@GetMapping("/read-purchase")
	@ResponseBody
	public Purchase getPurchaseById(@RequestParam String id) {
		return purchaseService.getPurchase(Integer.parseInt(id));
	}
	
	@PostMapping("/update-purchase")
	@ResponseBody
	public Purchase updatePurchase(@RequestParam Purchase purchase) {
		return purchaseService.createUpdatePurchase(purchase);
	}
	
	@GetMapping("/delete-purchase")
	@ResponseBody
	public void deletePurchase(@RequestParam String id) {
		purchaseService.deletePurchase(Integer.parseInt(id));
	}
	
	@GetMapping("/all-purchases")
	@ResponseBody
	public List<Purchase> getAllPurchases() {
		return purchaseService.getAllPurchases();
	}
	
	@GetMapping("/purchases-by-provider")
	@ResponseBody
	public List<Purchase> getPurchasesByProvider(@RequestParam String providerId) {
		return purchaseService.getPurchasesByProviderId(Integer.parseInt(providerId));
	}

}
