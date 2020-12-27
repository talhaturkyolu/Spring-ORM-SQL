package com.derivedquery.repository;

import com.derivedquery.entity.Department;
import com.derivedquery.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region,Long> {
}
