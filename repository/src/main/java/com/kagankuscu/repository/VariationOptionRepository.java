package com.kagankuscu.repository;

import com.kagankuscu.entity.VariationOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariationOptionRepository extends JpaRepository<VariationOption, Long> {
}
