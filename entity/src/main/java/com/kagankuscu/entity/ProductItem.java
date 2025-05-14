package com.kagankuscu.entity;


import com.kagankuscu.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "product_items")
public class ProductItem extends BaseEntity {

    @Column(nullable = false)
    private String SKU;

    @Column(nullable = false)
    private Integer stock;

    private String productImage;

    private Float price;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "product_item_variation_option",
            joinColumns = @JoinColumn(name = "product_item_id"),
            inverseJoinColumns = @JoinColumn(name = "variation_option_id")
    )
    private Set<VariationOption> variationOptions;

    @ManyToOne
    private Product product;
}
