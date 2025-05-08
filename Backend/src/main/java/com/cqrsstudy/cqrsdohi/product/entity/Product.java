package com.cqrsstudy.cqrsdohi.product.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    private String name;
    private String slug;
    private String shortDescription;
    private String fullDescription;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String status;

    @OneToMany(mappedBy = "product")
    private List<ProductCategory> productCategories;

    @OneToMany(mappedBy = "product")
    private List<ProductDetail> productDetails;

    @OneToMany(mappedBy = "product")
    private List<ProductPrice> productPrices;

    @OneToMany(mappedBy = "product")
    private List<ProductTag> productTags;

    @OneToMany(mappedBy = "product")
    private List<ProductImage> productImages;

    @OneToMany(mappedBy = "product")
    private List<ProductOptionGroup> productOptionGroups;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews;
}