package com.kagankuscu.entity;

import com.kagankuscu.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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
@Table(name = "user_method_payments")
public class ShoppingCart extends BaseEntity {

    @ManyToOne
    private AppUser appUser = null;
}
