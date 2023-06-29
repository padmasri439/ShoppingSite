package com.example.BackEnd.Repository;
import com.example.BackEnd.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepo extends JpaRepository<Order,Integer>
{
}
