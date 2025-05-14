package com.kagankuscu.entity;


import com.kagankuscu.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "payment_types")
public class PaymentType extends BaseEntity {

    @Column(nullable = false)
    private String value;
}
