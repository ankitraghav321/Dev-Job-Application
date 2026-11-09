package com.ankit.jobportal.services;


import com.ankit.jobportal.entity.*;
import com.ankit.jobportal.repository.JobPostActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobPostActivityService {

    private final JobPostActivityRepository jobPostActivityRepository;

    @Autowired
    public JobPostActivityService(JobPostActivityRepository jobPostActivityRepository) {
        this.jobPostActivityRepository = jobPostActivityRepository;
    }

    public JobPostActivity addNew(JobPostActivity jobPostActivity){
        return jobPostActivityRepository.save(jobPostActivity);
    }

    public List<RecruiterJobDto> getRecruiterJobs(int recruiter){

        List<IRecruiterJob> recruiterJobDtos = jobPostActivityRepository.getRecruiterJobs(recruiter);

        List<RecruiterJobDto> recruiterJobDtoList = new ArrayList<>();

        for(IRecruiterJob rec : recruiterJobDtos){
            JobLocation loc = new JobLocation(rec.getLocationId(), rec.getCity(), rec.getState(), rec.getCountry());
            JobCompany comp = new JobCompany(rec.getComapnyId(), rec.getName(), "");
            recruiterJobDtoList.add(new RecruiterJobDto(rec.getTotalCandidate(),rec.getJob_post_id(), rec.getJob_title(), loc, comp));



        }

        return recruiterJobDtoList;
    }


    public JobPostActivity getOne(int id ) {

        return jobPostActivityRepository.findById(id).orElseThrow(()->new RuntimeException("Job not Found"));

    }
}