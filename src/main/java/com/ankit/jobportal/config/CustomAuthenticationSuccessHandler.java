package com.ankit.jobportal.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {


//    @Override
//    public void onAuthenticationSuccess(
//            HttpServletRequest request,
//            HttpServletResponse response,
//            Authentication authentication)
//            throws IOException {
//
//        System.out.println(
//                "Logged in user: " + authentication.getName());
//
//        authentication.getAuthorities().forEach(authority ->
//                System.out.println("Authority: " + authority.getAuthority()));
//
//        response.sendRedirect(
//                request.getContextPath() + "/dashboard");
//    }


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String username = userDetails.getUsername();
        System.out.println("The username "+ username + " is logged in. ");
        boolean hasJobseekerRole = authentication.getAuthorities().stream().anyMatch(r->r.getAuthority().equals("Job Seeker"));
        boolean hasRecruiterRole = authentication.getAuthorities().stream().anyMatch(r->r.getAuthority().equals("Recruiter"));

        if(hasRecruiterRole || hasJobseekerRole){

            System.out.println("has jobseeker " +hasJobseekerRole );
            System.out.println("has recuiter " +hasRecruiterRole );
            response.sendRedirect(request.getContextPath() +"/dashboard/");
        }

    }
}
