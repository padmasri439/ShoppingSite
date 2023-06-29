package com.example.BackEnd.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Purchase")
public class Purchase
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer purchaseId;
    private Integer productId;
    private String productName;
    private Integer productPrice;
    private Long productQuantity;
    private String name;
    private String phone;
    private String address;
}
