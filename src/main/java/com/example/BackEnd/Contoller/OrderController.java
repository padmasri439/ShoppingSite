package com.example.BackEnd.Contoller;

import com.example.BackEnd.Entity.Order;
import com.example.BackEnd.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class OrderController
{
    @Autowired
    public OrderService orderService;

    @PostMapping("order/add")
    public void addOrders(@RequestBody Order o){
        orderService.saveOrders(o);
    }

    @GetMapping("order/fetch")
    public List<Order> getOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/order/fetchById/{id}")
    public Optional<Order> getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }

    @DeleteMapping("order/delete")
    public void deleteOrder(){
        orderService.delOrder();
    }

    @DeleteMapping("/order/delById/{id}")
    public ResponseEntity<Integer> deleteOrderById(@PathVariable Integer id)
    {
        orderService.delOrderById(id);
        return ResponseEntity.ok(id);
    }
}
