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
@Table(name = "user_payment_method")
public class UserPaymentMethod extends BaseEntity {

    @Column(nullable = false)
    private String provider;
    @Column(nullable = false)
    private String accountNumber;
    @Column(nullable = false)
    private LocalDateTime expiryDate;
    @Column(nullable = false)
    private Boolean isDefault;

    @ManyToOne
    private AppUser user = null;
    @ManyToOne
    private PaymentType paymentType;
}
