package ru.otus.nyuri.msa.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "of")
public class HealthResponse {
    public static HealthResponse OK = HealthResponse.of("OK");

    private String status;
}
