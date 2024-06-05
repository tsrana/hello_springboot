package com.example.hello_springboot.probs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Readiness {

    @GetMapping("/health/readiness")
    public ResponseEntity<String> liveness() {
    	String text = "Readiness is success";
		System.out.println(text);
        return ResponseEntity.ok("Alive");
    }
}
