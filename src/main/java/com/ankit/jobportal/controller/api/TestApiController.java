package com.ankit.jobportal.controller.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestApiController {

    @GetMapping("/protected")
    public String protectedApi() {
        return "JWT authentication successful!";
    }

    @GetMapping("/job-seeker")
    @PreAuthorize("hasAuthority('Job Seeker')")
    public String jobSeekerApi() {
        return "Welcome Job Seeker!";
    }

    @GetMapping("/recruiter")
    @PreAuthorize("hasAuthority('Recruiter')")
    public String recruiterApi() {
        return "Welcome Recruiter!";
    }
}