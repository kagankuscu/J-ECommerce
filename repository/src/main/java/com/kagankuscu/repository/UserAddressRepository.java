package com.kagankuscu.repository;

import com.kagankuscu.composite_key.UserAddressId;
import com.kagankuscu.entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress, UserAddressId> {
}
