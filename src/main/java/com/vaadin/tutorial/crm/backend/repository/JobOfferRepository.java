package com.vaadin.tutorial.crm.backend.repository;

import com.vaadin.tutorial.crm.backend.entity.JobOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobOfferRepository extends JpaRepository<JobOffer, Long> {
}
