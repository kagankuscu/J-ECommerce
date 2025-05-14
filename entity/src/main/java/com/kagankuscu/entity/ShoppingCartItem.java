package com.kagankuscu.entity;

import com.kagankuscu.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "shopping_cart_items")
public class ShoppingCartItem extends BaseEntity {

    private Integer quantity;

    @ManyToOne
    private ShoppingCart shoppingCart;
    @ManyToOne
    private ProductItem productItem;

}
