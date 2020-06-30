package com.hiberu.repository;

import com.hiberu.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetailsRepository extends JpaRepository<Details, Integer> {
}
