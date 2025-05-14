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
@Table(name = "user_review")
public class UserReview extends BaseEntity {

    private Integer ratingValue;
    @Column(nullable = false)
    private String comment = "";

    @ManyToOne
    private OrderLine orderLine;
    @ManyToOne
    private AppUser appUser = null;
}
