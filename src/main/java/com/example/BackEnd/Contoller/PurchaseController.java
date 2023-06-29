package com.example.BackEnd.Contoller;

import com.example.BackEnd.Entity.Purchase;
import com.example.BackEnd.Service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class PurchaseController
{
    @Autowired
    public PurchaseService purchaseService;

    @PostMapping("purchase/add")
    public void addPurchases(@RequestBody Purchase P){
        purchaseService.savePurchase(P);
    }

    @GetMapping("purchase/fetch")
    public List<Purchase> getPurchases(){
        return purchaseService.getAllPurchases();
    }

    @GetMapping("/purchase/fetchById/{id}")
    public Optional<Purchase> getPurchaseId(@PathVariable Integer id){
        return purchaseService.getPurchaseById(id);
    }

    @DeleteMapping("/purchase/delById/{id}")
    public ResponseEntity<Integer> deletePurchaseId(@PathVariable Integer id)
    {
        purchaseService.delPurchaseById(id);
        return ResponseEntity.ok(id);
    }

}
