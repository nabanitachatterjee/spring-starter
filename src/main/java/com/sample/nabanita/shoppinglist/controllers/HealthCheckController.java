package com.sample.nabanita.shoppinglist.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/infra/health")
class HealthCheckController {
    @GetMapping
    ResponseEntity getHealth() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
