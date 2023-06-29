package com.example.BackEnd.Contoller;

import com.example.BackEnd.Entity.Product;
import com.example.BackEnd.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class ProductController
{
 @Autowired
public ProductService productService;

    @PostMapping("/product/add")
    public Product addProduct(@RequestBody Product p){
       return productService.saveProduct(p);
    }

    @PostMapping("product/addAll")
    public List<Product> addAllProducts(@RequestBody List<Product> P){
        return productService.saveAllProducts(P);
    }

    @GetMapping("/product/fetch")
    public List<Product> getProducts()
    {
        return productService.getAllProducts();
    }
    @GetMapping("/product/fetchById/{id}")
    public Optional<Product> getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }
}
