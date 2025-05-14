package com.kagankuscu.entity;


import com.kagankuscu.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "order_lines")
public class OrderLine extends BaseEntity {

    @Column(nullable = false)
    private Integer quantity;
    @Column(nullable = false)
    private Float price;

    @ManyToOne
    private ProductItem productItem;
    @ManyToOne
    private ShopOrder shopOrder;
}
