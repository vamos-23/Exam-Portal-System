package com.examportal.backend.dto;

import lombok.Data;
import java.util.List;

@Data
public class AnswerRequest {
    private Long questionId;
    private List<String> selectedOptions;
}