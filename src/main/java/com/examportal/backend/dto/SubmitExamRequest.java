package com.examportal.backend.dto;

import lombok.Data;
import java.util.List;

@Data
public class SubmitExamRequest {
    private Long examId;
    private List<AnswerRequest> answers;
}