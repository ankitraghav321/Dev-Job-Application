package com.ankit.jobportal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "skills")
public class Skills {

    @Id
    private int id;

    private String name;

    private String experienceLevel;

    private String yearofExperience;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "job_seeker_profile")
    private JobSeekerProfile jobSeekerProfile;

    public Skills() {
    }

    public Skills(int id, String name, String experienceLevel, String yearofExperience, JobSeekerProfile jobSeekerProfil) {
        this.id = id;
        this.name = name;
        this.experienceLevel = experienceLevel;
        this.yearofExperience = yearofExperience;
        this.jobSeekerProfile = jobSeekerProfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public String getYearofExperience() {
        return yearofExperience;
    }

    public void setYearofExperience(String yearofExperience) {
        this.yearofExperience = yearofExperience;
    }

    public JobSeekerProfile getJobSeekerProfil() {
        return jobSeekerProfile;
    }

    public void setJobSeekerProfil(JobSeekerProfile jobSeekerProfil) {
        this.jobSeekerProfile = jobSeekerProfil;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", experienceLevel='" + experienceLevel + '\'' +
                ", yearofExperience='" + yearofExperience + '\'' +
                ", jobSeekerProfil=" + jobSeekerProfile +
                '}';
    }
}
