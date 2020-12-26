package com.orm.repository;

import com.orm.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Address,Long> {
}
