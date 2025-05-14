package com.kagankuscu.entity;

import com.kagankuscu.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "promotions")
public class Promotion extends BaseEntity {

    @Column(nullable = false)
    private String name;

    private String description;
    private Integer discountRate;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "promotion_product_category",
            joinColumns = @JoinColumn(name = "promotion_id"),
            inverseJoinColumns = @JoinColumn(name = "product_category_id")
    )
    private Set<ProductCategory> productCategories;
}
