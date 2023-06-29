package com.example.BackEnd.Service;

import com.example.BackEnd.Entity.Purchase;
import com.example.BackEnd.Repository.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    public PurchaseRepo purchaseRepo;
    public void savePurchase(Purchase p){
        purchaseRepo.save(p);
    }
    public List<Purchase> getAllPurchases(){
        return purchaseRepo.findAll();
    }
    public Optional<Purchase> getPurchaseById(Integer id){
        return purchaseRepo.findById(id);
    }
    public void delPurchaseById(Integer id){
        purchaseRepo.findById(id);
    }

}
