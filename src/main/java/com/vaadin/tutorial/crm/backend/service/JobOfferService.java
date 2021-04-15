package com.vaadin.tutorial.crm.backend.service;

import com.vaadin.tutorial.crm.backend.entity.JobOffer;
import com.vaadin.tutorial.crm.backend.repository.JobOfferRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class JobOfferService {
    private static final Logger LOGGER = Logger.getLogger(ContactService.class.getName());
    private JobOfferRepository jobOfferRepository;

    public JobOfferService(JobOfferRepository jobOfferRepository){
        this.jobOfferRepository = jobOfferRepository;
    }

    public List<JobOffer> findAll(){ return jobOfferRepository.findAll(); }

    public List<JobOffer> findAll(String filterText){
        if(filterText == null || filterText.isEmpty())
            return jobOfferRepository.findAll();
        else
            return jobOfferRepository.findAll();
    }

    public long count() { return jobOfferRepository.count(); }

    public void delete(JobOffer jobOffer) { jobOfferRepository.delete(jobOffer); }

    public void save(JobOffer jobOffer){
        if(jobOffer == null){
            LOGGER.log(Level.SEVERE,
                    "JobOffer is null. Are you sure you have connected your form to the application?");
            return;
        }
        jobOfferRepository.save(jobOffer);
    }
}
