package com.example.BackEnd.Service;

import com.example.BackEnd.Entity.Order;
import com.example.BackEnd.Repository.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    public OrdersRepo orderRepo;

    public void saveOrders(Order o){
        orderRepo.save(o);
    }
    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }
    public Optional<Order> getOrderById(Integer id){
        return orderRepo.findById(id);
    }
    public void delOrder(){
        orderRepo.deleteAll();
    }
    public void delOrderById(int id){
        orderRepo.deleteById(id);
    }

}
