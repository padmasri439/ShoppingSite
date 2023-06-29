package com.example.BackEnd.Service;

import com.example.BackEnd.Entity.Product;
import com.example.BackEnd.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    public ProductRepo productRepo;
    public Product saveProduct(Product p){
     return  productRepo.save(p);
    }
    public List<Product> saveAllProducts(List<Product> P){
        return productRepo.saveAll(P);
    }
    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }
    public Optional<Product> getProductById(Integer id){
        return productRepo.findById(id);
    }
}
