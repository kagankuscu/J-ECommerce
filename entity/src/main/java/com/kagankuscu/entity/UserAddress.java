package com.kagankuscu.entity;

import com.kagankuscu.composite_key.UserAddressId;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "user_address")
public class UserAddress {

    @EmbeddedId
    private UserAddressId userAddressId;

    private Boolean isDefault;

    @ManyToOne
    @MapsId("userId")
    private AppUser user;

    @ManyToOne
    @MapsId("addressId")
    private Address address;
}
