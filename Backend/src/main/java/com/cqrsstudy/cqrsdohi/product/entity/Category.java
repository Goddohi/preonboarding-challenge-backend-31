package com.cqrsstudy.cqrsdohi.product.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Category {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parent;

    private String name;
    private String slug;
    private String description;
    private Integer level;
    private String imageUrl;
}
