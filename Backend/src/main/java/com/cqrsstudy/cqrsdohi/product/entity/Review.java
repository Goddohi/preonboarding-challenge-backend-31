package com.cqrsstudy.cqrsdohi.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Review {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Long userId; // 우선 단순 FK

    private Integer rating;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean verifiedPurchase;
    private Integer helpfulVotes;
}