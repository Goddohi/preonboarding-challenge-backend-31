package com.cqrsstudy.cqrsdohi.product.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ProductImage {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "option_id")
    private ProductOption option;

    private String url;
    private String altText;
    private Boolean isPrimary;
    private Integer displayOrder;
}
