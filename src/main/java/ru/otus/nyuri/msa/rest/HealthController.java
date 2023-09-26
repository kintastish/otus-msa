package ru.otus.nyuri.msa.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.nyuri.msa.model.HealthResponse;

@RestController
public class HealthController {
    @GetMapping("health")
    public HealthResponse getHealth() {
        return HealthResponse.OK;
    }
}
