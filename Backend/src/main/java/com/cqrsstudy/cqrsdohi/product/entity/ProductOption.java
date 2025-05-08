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
public class ProductOption {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "option_group_id")
    private ProductOptionGroup optionGroup;

    private String name;
    private Double additionalPrice;
    private String sku;
    private Integer stock;
    private Integer displayOrder;
}
