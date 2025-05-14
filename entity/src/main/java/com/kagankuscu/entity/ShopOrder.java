package com.kagankuscu.entity;


import com.kagankuscu.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "shop_orders")
public class ShopOrder extends BaseEntity {

    @Column(updatable = false, insertable = false)
    private LocalDateTime orderDate = LocalDateTime.now();

    @Column(nullable = false)
    private Integer orderTotal;

    @ManyToOne
    private UserMethodPayment userMethodPayment;

    @ManyToOne
    private Address address;

    @ManyToOne
    private ShippingMethod shippingMethod;

    @ManyToOne
    private OrderStatus orderStatus;

    @ManyToOne
    private AppUser appUser;
}
