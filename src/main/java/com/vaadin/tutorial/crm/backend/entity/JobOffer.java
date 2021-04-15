package com.vaadin.tutorial.crm.backend.entity;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class JobOffer extends AbstractEntity{

    @NotNull
    @NotEmpty
    private String JobOfferID;

    @NotNull
    @NotEmpty
    private String title;

    @NotNull
    @NotEmpty
    private String employerID;

    @NotNull
    @NotEmpty
    private String location;

    @NotNull
    @NotEmpty
    private Date deadline;

    @NotNull
    @NotEmpty
    private String specialRequirements;

    @NotNull
    @NotEmpty
    private double duration;

    @NotNull
    @NotEmpty
    private double hourlyRate;

    @NotNull
    @NotEmpty
    private int status;

    public String getJobOfferID() { return JobOfferID; }

    public void setJobOfferID(String jobOfferID) { JobOfferID = jobOfferID; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getEmployerID() { return employerID; }

    public void setEmployerID(String employerID) { this.employerID = employerID; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public Date getDeadline() { return deadline; }

    public void setDeadline(Date deadline) { this.deadline = deadline; }

    public String getSpecialRequirements() { return specialRequirements; }

    public void setSpecialRequirements(String specialRequirements) { this.specialRequirements = specialRequirements; }

    public double getDuration() { return duration; }

    public void setDuration(double duration) { this.duration = duration; }

    public double getHourlyRate() { return hourlyRate; }

    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }

    public int getStatus() { return status; }

    public void setStatus(int status) { this.status = status; }
}
