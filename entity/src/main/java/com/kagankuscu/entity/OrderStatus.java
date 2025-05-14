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
@Table(name = "order_statuses")
public class OrderStatus extends BaseEntity {

    @Column(nullable = false)
    private String status;
}
