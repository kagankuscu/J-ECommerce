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
@Table(name = "user_method_payments")
public class UserMethodPayment extends BaseEntity {

    @Column(nullable = false)
    private String provider;
    @Column(nullable = false)
    private String accountNumber;
    @Column(nullable = false)
    private LocalDateTime expiryDate;
    @Column(nullable = false)
    private Boolean isDefault;

    @ManyToOne
    private AppUser appUser = null;
    @ManyToOne
    private PaymentType paymentType;
}
