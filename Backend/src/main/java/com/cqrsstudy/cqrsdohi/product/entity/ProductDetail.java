package com.cqrsstudy.cqrsdohi.product.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ProductDetail {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Double weight;
    private String dimensions; // JSON
    private String materials;
    private String countryOfOrigin;
    private String warrantyInfo;
    private String careInstructions;
    private String additionalInfo; // JSONB
}
