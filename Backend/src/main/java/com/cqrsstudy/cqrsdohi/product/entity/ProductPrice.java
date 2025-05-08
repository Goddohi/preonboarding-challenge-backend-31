package com.cqrsstudy.cqrsdohi.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ProductPrice {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Double basePrice;
    private Double salePrice;
    private Double costPrice;
    private String currency;
    private Double taxRate;
}