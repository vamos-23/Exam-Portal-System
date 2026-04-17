package com.examportal.backend.controller;

import com.examportal.backend.dto.SubmitExamRequest;
import com.examportal.backend.entity.Submission;
import com.examportal.backend.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student/exams")
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @PostMapping("/submit")
    public Submission submit(@RequestBody SubmitExamRequest request, Authentication auth) {
        return submissionService.submitExam(request, auth.getName());
    }
}