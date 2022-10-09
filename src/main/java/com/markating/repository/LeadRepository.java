package com.markating.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.markating.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
