package com.kagankuscu.composite_key;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class UserAddressId implements Serializable {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "address_id")
    private Long addressId;
}
