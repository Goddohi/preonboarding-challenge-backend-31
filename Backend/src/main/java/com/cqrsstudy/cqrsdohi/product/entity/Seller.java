package com.cqrsstudy.cqrsdohi.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Seller {
    @Id
    private Long id;

    private String name;
    private String description;
    private String logoUrl;
    private Double rating;
}

