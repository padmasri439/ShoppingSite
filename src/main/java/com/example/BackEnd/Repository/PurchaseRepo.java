package com.example.BackEnd.Repository;

import com.example.BackEnd.Entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepo extends JpaRepository<Purchase,Integer>
{

}
