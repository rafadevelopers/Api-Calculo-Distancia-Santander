package com.api.desafiosantander.repository;

import com.api.desafiosantander.model.Entity.Agency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgencyRepository extends JpaRepository<Agency, Long> {
}
