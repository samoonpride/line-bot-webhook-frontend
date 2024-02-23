package com.samoonpride.line.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimilarityCheckerRequest {
    private String title;
    private double latitude;
    private double longitude;
}
