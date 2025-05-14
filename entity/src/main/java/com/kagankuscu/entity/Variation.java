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
@Table(name = "variations")
public class Variation extends BaseEntity {

    @Column(nullable = false)
    private String name;

   @ManyToOne
   private ProductCategory productCategory;
}
