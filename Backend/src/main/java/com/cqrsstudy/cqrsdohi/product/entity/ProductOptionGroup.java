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
public class ProductOptionGroup {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private String name;
    private Integer displayOrder;

    @OneToMany(mappedBy = "optionGroup")
    private List<ProductOption> options;
}
