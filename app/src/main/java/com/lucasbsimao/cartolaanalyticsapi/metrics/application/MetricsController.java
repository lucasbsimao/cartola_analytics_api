package com.lucasbsimao.cartolaanalyticsapi.metrics.application;

import com.lucasbsimao.cartolaanalyticsapi.metrics.domain.Metrics;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/metrics")
public class MetricsController {

    @GetMapping(path = "/")
    public ResponseEntity<Metrics> get() {

        return new ResponseEntity<Metrics>(new Metrics("teste"), HttpStatus.OK);
    }
}
